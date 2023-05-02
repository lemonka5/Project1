package api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RestApiLandingPageTest extends HelperMethodsApi {

    @Test
    public void contextLoads() {
    }

    //S1: User logs in to the account
    @Given("The Book Store Api page")
    public void theBookStoreApiPage() {
    }

    @When("User logs in to the account")
    public void userLogsInToTheAccount() {
        String body = """
                {
                "userName": "Tester",
                "password": "Parola10!"
                }
                """;
        res = given().header("Content-Type", "application/json").body(body).post(endpointlogin).then().log().body();
    }

    @Then("Check if user is logged in with valid credentials")
    public void checkIfUserIsLoggedInWithValidCredentials() {
        res.assertThat().statusCode(200);
    }


    //S2: User displays all the books available
    @Given("The Book Store page")
    public void theBookStorePage() {
    }

    @When("User displays all the books")
    public void userDisplaysAllTheBooks() {
        res = given().when().get(endpointbooks).then().log().body();
    }

    @Then("Check if all the books were displayed")
    public void checkIfAllTheBooksWereDisplayed() {
        res.assertThat().statusCode(200).
                body("books.isbn.toString()", equalTo(ISBNs));

    }


    // S3: Create a new user
    @When("A new user is created")
    public void aNewUserIsCreated() {
        String newuser = """
                {
                  \"userName\": \"Tester\",
                  \"password\": \"Parola10!\"
                }
                """;

        res = given().header("Content-Type", "application/json").body(newuser).post(endpointcreateuser).then().log().body();
    }

    @Then("Check if the user was created")
    public void checkIfTheUserWasCreated() {
        //res.assertThat().body("username", equalTo("Tester"));res.assertThat().body("code", equalTo("1204"));
        System.out.println("User was created");
    }


    @When("A user is deleted")
    public void aUserIsDeleted() {
        String deleteUser = """
                {
                  \"userID\": \"b493a9ca-55ae-4c06-8e5b-773733d433b5\"
                }
                """;
        String credentials = "Tester:Parola10!";
        byte[] encodedCredentials = Base64.encodeBase64(credentials.getBytes());
        String encodedCredentialsAsString = new String(encodedCredentials);
        res = given().pathParam("UUID", "b493a9ca-55ae-4c06-8e5b-773733d433b5").header(auth, "Basic " + encodedCredentialsAsString).
                header("Content-Type", "application/json").body(deleteUser).delete(endpointdeleteuser).then().log().body();


    }

    @Then("Check if the user was deleted")
    public void checkIfTheUserWasDeleted() {
    }

    //S5: Add a book to cart

    @When("The user adds a book to cart")
    public void theUserAddsABookToCart() {
        String book = """        
                {        
                "userId": "b493a9ca-55ae-4c06-8e5b-773733d433b5",          
                "collectionOfIsbns": [            
                {              
                "isbn": "9781449325862"            
                }          
                ]        
                }        
                """;

        String credentials = "Tester:Parola10!";
        byte[] encodedCredentials = Base64.encodeBase64(credentials.getBytes());
        String encodedCredentialsAsString = new String(encodedCredentials);

        res = given().header(auth, "Basic " + encodedCredentialsAsString).
                header("Content-Type", "application/json").body(book).
                post(endpointbooks).then().log().body();
    }

    @Then("Check if the book was added to cart")
    public void checkIfTheBookWasAddedToCart() {
        res.assertThat().statusCode(201).
                body("books.isbn.toString()", equalTo(ISBN));
        System.out.println("The book was added");

    }


    @When("The user delete a book from cart")
    public void theUserDeleteABookFromCart() {
        String deletebook = """
                {
                  "isbn": "9781449325862",
                  "userId": "b493a9ca-55ae-4c06-8e5b-773733d433b5"
                }
                """;

        String credentials = "Tester:Parola10!";
        byte[] encodedCredentials = Base64.encodeBase64(credentials.getBytes());
        String encodedCredentialsAsString = new String(encodedCredentials);

        res = given().header(auth, "Basic " + encodedCredentialsAsString).
                header("Content-Type", "application/json").body(deletebook).delete(endpointdeletebook).then().log().body();
        
    }

    @Then("Check if the book was deleted")
    public void checkIfTheBookWasDeleted() {
        res.assertThat().statusCode(204);
        System.out.println("Book was deleted");
    }

    @When("The user change the book on cart")
    public void theUserChangeTheBookOnCart() {
        String modifybook = """
                {
                  "isbn": "9781449331818",
                  "userId": "b493a9ca-55ae-4c06-8e5b-773733d433b5"
                }
                """;
        String credentials = "Tester:Parola10!";
        byte[] encodedCredentials = Base64.encodeBase64(credentials.getBytes());
        String encodedCredentialsAsString = new String(encodedCredentials);
        res = given().header(auth, "Basic " + encodedCredentialsAsString).header("Content-Type", "application/json").
                body(modifybook).put(enpointchangebook).then().log().body();


        
    }

    @Then("Check if the book was changed")
    public void checkIfTheBookWasChanged() {
        res.assertThat().statusCode(200);
        System.out.println("The book was changed");
    }
}
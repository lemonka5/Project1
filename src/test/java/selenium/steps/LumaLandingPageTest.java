package selenium.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.pageObjects.LumaLandingPage;
import utils.Base;

import java.io.IOException;

import static utils.Base.*;

public class LumaLandingPageTest {
    @Test
    void contextLoads() {
    }

    //Log into Luma Store with given credentials
    @Given("The valid credentials")
    public void theValidCredentials() throws IOException, InterruptedException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrl"));
        driver.manage().window().maximize();
        LumaLandingPage luma = new LumaLandingPage(driver);
        luma.clicksignin().click();

    }

    @When("User logs in")
    public void userLogsIn() throws InterruptedException {
        LumaLandingPage luma = new LumaLandingPage(driver);
        luma.typeEmail().sendKeys("roni_cost@example.com");
        luma.typePassword().sendKeys("roni_cost3@example.com");
        wait.until(ExpectedConditions.visibilityOf(luma.clickSigninFinal()));
        luma.clickSigninFinal().click();
    }

    @Then("Check if user is logged in")
    public void checkIfUserIsLoggedIn() {
        //captcha trebe rezolvat!!!!
    }

    @Given("The Man section")
    public void theManSection() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrl"));
        driver.manage().window().maximize();


    }

    @When("User select the section Man_Tops_Tanks")
    public void userSelectTheSectionMan_Tops_Tanks() {
        LumaLandingPage luma = new LumaLandingPage(driver);
        luma.clickButtonMen().click();
        luma.clickButtonTanks().click();


    }

    @And("Select Atlas Fitness Tank product with size L and colour blue")
    public void selectAtlasFitnessTankProductWithSizeLAndColourBlue() throws InterruptedException {
        LumaLandingPage luma = new LumaLandingPage(driver);
        luma.buttonAtlasTankSizeL().click();
        luma.buttonAtlasTankColourBlue().click();
        Thread.sleep(3000);


    }

    @And("Adds the product to cart")
    public void addsTheProductToCart() {
        LumaLandingPage luma = new LumaLandingPage(driver);
        luma.clickButtonAddToCart().click();
        //wait.until(ExpectedConditions.textToBePresentInElement(luma.addToCartMessage(),
        //      "You added Atlas Fitness Tank to your" ));
    }

    @Then("Check if product is added to cart")
    public void checkIfProductIsAddedToCart() {
        LumaLandingPage luma = new LumaLandingPage(driver);
        Assert.assertEquals("You added Atlas Fitness Tank to your shopping cart.", (luma.addToCartMessage().getText()));
    }
}

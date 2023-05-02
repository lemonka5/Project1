package selenium.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.springframework.http.server.DelegatingServerHttpResponse;
import selenium.pageObjects.DemoqaLandingPage;
import utils.Base;

import java.io.IOException;
import java.util.ArrayList;


import static utils.Base.*;
import org.openqa.selenium.Keys;
import utils.HelperMethodsSelenium;


public class DemoqaLandingPageTest extends HelperMethodsSelenium {

    public DemoqaLandingPageTest() {
    }

    @Test
    public void contextLoads() {
    }

    //S1:Complete de student registration form
    @Given("The practice form section from the main page")
    public void thePracticeFormSectionFromTheMainPage() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrl"));
        driver.manage().window().maximize();
    }

    @When("User completes the student registration form")
    public void userCompletesTheStudentRegistrationForm() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        wait.until(ExpectedConditions.visibilityOf(demo.pfMain()));
        demo.pfMain().click();
        wait.until(ExpectedConditions.visibilityOf(demo.pfSecondary()));
        demo.pfSecondary().click();
        demo.pfFirstName().sendKeys("John");
        demo.pfLastname().sendKeys("Zen");
        wait.until(ExpectedConditions.visibilityOf(demo.pfEmail()));
        demo.pfEmail().sendKeys("zen@gmail.com");
        demo.pfGenderBox().click();
        demo.pfPhoneNumber().sendKeys("0799456789");
        demo.pfDateOfBirth().click();
        demo.pfMonthSelector().click();
        demo.pfMonthSelectSeptember().click();
        demo.pfYearSelector().click();
        demo.pfSelectYear1999().click();
        demo.pfYearSelector().click();
        demo.pfSelect9September().click();
        demo.pfMusicButton().click();
        demo.pfUploadPicture().sendKeys("C:\\Users\\levente.molnar\\Downloads\\781665.png");
        demo.pfCurrentAddress().sendKeys("Romania, Cluj, Alba");
        demo.pfSelectStateButton().click();
        demo.pfSelectState().sendKeys("NCR", Keys.ENTER);
        demo.pfSelectCityButton().click();
        demo.pfSelectCity().sendKeys("Delhi", Keys.ENTER);




    }

    @And("Clicks the submit button")
    public void clicksTheSubmitButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.pfSubmitButton().click();

    }

    @Then("Check if student name and email are correct")
    public void checkIfStudentNameAndEmailAreCorrect() {

        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        String studentname = "John Zen";
        String email = "zen@gmail.com";
        Assert.assertEquals(studentname, demo.pfCheckStudentName().getText());
        Assert.assertEquals(email, demo.pfCheckEmail().getText());
        if(studentname.equals(demo.pfCheckStudentName().getText()) && email.equals(demo.pfCheckEmail().getText())){
            System.out.println("The test passed");
        }else{
            System.out.println("The test failed");
        }
    }

    @Given("The buttons feature")
    public void theButtonsFeature() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlButtons"));
        driver.manage().window().maximize();
    }

    @When("User performs a double click")
    public void userPerformsADoubleClick() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Actions actions = new Actions(driver);
        actions.doubleClick(demo.ebDoubleClickMe()).perform();

    }

    @And("User performs a right click")
    public void userPerformsARightClick() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Actions actions = new Actions(driver);
        actions.contextClick(demo.ebRightClickMe()).perform();

    }

    @And("User performs a left click")
    public void userPerformsALeftClick() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Actions actions = new Actions(driver);
        actions.click(demo.ebClickMe()).perform();

    }

    @Then("Check if the actions were performed correctly")
    public void checkIfTheActionsWerePerformedCorrectly() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        String doubleclickmessage = "You have done a double click";
        String rightlickmessage = "You have done a right click";
        String clickmessage = "You have done a dynamic click";
        Assert.assertEquals(doubleclickmessage, demo.ebDoubleClickMessage().getText());
        Assert.assertEquals(rightlickmessage, demo.ebRightClickMessage().getText());
        Assert.assertEquals(clickmessage, demo.ebClickMessage().getText());
    }

    //S3 Test the browser feature from the alerts section

    @Given("The Browser window feature")
    public void theBrowserWindowFeature() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlBrowserWindows"));
        driver.manage().window().maximize();

    }

    @When("the user Click on the New tab Button")
    public void theUserClickOnTheNewTabButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.bwNewTabButton().click();
        ArrayList<String> twotabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(twotabs.get(1));
        String newtab = "This is a sample page";
        Assert.assertEquals(newtab, demo.bwNewTabMessage().getText());
        if (newtab.equals(demo.bwNewTabMessage().getText())) {
            System.out.println("The new tab is checked");}
        driver.close();
        driver.switchTo().window(twotabs.get(0));


    }

    @And("the user Click the New Window Button")
    public void theUserClickTheNewWindowButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.bwNewWindowButton().click();
        ArrayList<String> twowindows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(twowindows.get(1));
        String newwindow = "This is a sample page";
        Assert.assertEquals(newwindow, demo.bwNewTabMessage().getText());
        if (newwindow.equals(demo.bwNewTabMessage().getText())) {
            System.out.println("The new window is checked");}
        driver.close();
        driver.switchTo().window(twowindows.get(0));

    }

    @And("the user Click the New Window Message")
    public void theUserClickTheNewWindowMessage() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.bwMessageWindowButton().click();
        ArrayList<String> twowindows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(twowindows.get(1));
        driver.close();
        driver.switchTo().window(twowindows.get(0));
    }

    @Then("Check if all the actions were performed correctly")
    public void checkIfAllTheActionsWerePerformedCorrectly() {
    }


    //S4:Test the auto complete feature from the widgets section

    @Given("The auto complete feature from the widgets section")
    public void theAutoCompleteFeatureFromTheWidgetsSection() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlWidgetAutoComplete"));
        driver.manage().window().maximize();

    }

    @When("User types color Red and Blue in the multiple colors field")
    public void userTypesColorRedAndBlueInTheMultipleColorsField() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.acMultipleColorField().sendKeys("Red");
        demo.acMultipleColorField().sendKeys(Keys.ENTER);
        demo.acMultipleColorField().sendKeys("Blue");
        demo.acMultipleColorField().sendKeys(Keys.ENTER);
        //driver.close();


    }

    @And("User types color Black in the Single Color Field")
    public void userTypesColorBlackInTheSingleColorField() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.acSingleColorField().sendKeys("Black");
        demo.acSingleColorField().sendKeys(Keys.ENTER);

    }

    @Then("Check if the colors remain imputed on the fields")
    public void checkIfTheColorsRemainImputedOnTheFields() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Assert.assertEquals("Red", demo.acMultipleColorRedCheck().getText());
        Assert.assertEquals("Blue", demo.acMultipleColorBlueCheck().getText());
        Assert.assertEquals("Black", demo.acSingleColorBlackCheck().getText());
        if("Red".equals(demo.acMultipleColorRedCheck().getText()) && "Blue".equals(demo.acMultipleColorBlueCheck().getText()) && "Black".equals(demo.acSingleColorBlackCheck().getText())){
            System.out.println("Test Passed");
            driver.close();
        }
    }

    //S5--TC1: Test the droppable feature from the interactions section
    @Given("The droppable feature from the interactions section")
    public void theDroppableFeatureFromTheInteractionsSection() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlInteractionDroppable"));
        driver.manage().window().maximize();

    }

    @When("Performs the drag and drop action")
    public void performsTheDragAndDropAction() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Actions simpledraganddrop = new Actions(driver);
        simpledraganddrop.dragAndDrop(demo.ddSimpleDragElement(), demo.ddSimpleDropElement()).build().perform();

    }

    @Then("Check if the action was performed correctly")
    public void checkIfTheActionWasPerformedCorrectly() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Assert.assertEquals("Dropped!", demo.ddSimpleDropElement().getText());
        if("Dropped!".equals(demo.ddSimpleDropElement().getText())){
            System.out.println("A mers testul");

        }
    }
      //TC2: Test the Accept droppable features from the interaction section

    @Given("The two droppable feature from the interaction section")
    public void theTwoDroppableFeatureFromTheInteractionSection() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlInteractionDroppable"));
        driver.manage().window().maximize();

    }

    @When("The user perform the drag and drop interaction section")
    public void theUserPerformTheDragAndDropInteractionSection() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.ddAcceptButton().click();
        Actions simpledraganddrop = new Actions(driver);
        simpledraganddrop.dragAndDrop(demo.ddAcceptableDragElement() , demo.ddAcceptableDropElement()).build().perform();
        simpledraganddrop.dragAndDrop(demo.ddNotAcceptableDragElement(), demo.ddAcceptableDropElement()).build().perform();



    }

    @Then("one is dropped and one is not")
    public void oneIsDroppedAndOneIsNot() {
    }

    //S6: Test the Resizable Feature from Interactions system
    @Given("The restricted resizable box")
    public void theRestrictedResizableBox() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlResizable"));
        driver.manage().window().maximize();

    }

    @When("user performs the drag operation to maximum size")
    public void userPerformsTheDragOperationToMaximumSize() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Actions action = new Actions(driver);
        action.clickAndHold(demo.rsRestrictedResizableHandle()).moveByOffset(500 ,300).release().build().perform();

    }

    @Then("Check if the element size it's changed")
    public void checkIfTheElementSizeItSChanged() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        String size = "(500, 300)";

        if (size.equals(demo.rsCheckRestrictedResizable().getSize().toString())) {
            System.out.println("S6:Test has passed");
        }else{
            System.out.println("Test has failed");
            }
        driver.close();

    }

         //S7:Test the sortable feature from the interactions system
    @Given("The sortable list feature")
    public void theSortableListFeature() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlSortable"));
        driver.manage().window().maximize();

    }

    @When("User drags the One element after the three element")
    public void userDragsTheOneElementAfterTheThreeElement() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Actions actions = new Actions(driver);
        actions.clickAndHold(demo.srOneElement()).release(demo.srThreeElement()).build().perform();

    }

    @Then("Check if the One element was dragged in the right position")
    public void checkIfTheOneElementWasDraggedInTheRightPosition() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        String listafterchanging = """        
                Two        
                Three        
                One        
                Four        
                Five        
                Six""";
        Assert.assertEquals(listafterchanging, demo.srListOfNumbers().getText());
        System.out.println("The list of numbers after changing the order is: " + demo.srListOfNumbers().getText());

        driver.close();

    }
    //S8 tc1:Test the Alerts feature from the Alert, frame and Windows

    @Given("The main Alerts page")
    public void theMainAlertsPage() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlAlerts"));
        driver.manage().window().maximize();
    }

    @When("User clicks the simple alert button")
    public void userClicksTheSimpleAlertButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.alClickAlertButton().click();

        
    }

    @And("Close the alert box")
    public void closeTheAlertBox() {
        //DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Alert simplealert = driver.switchTo().alert();
        simplealert.accept();
        
    }

    @Then("Check if alert box is closed")
    public void checkIfAlertBoxIsClosed() {
        //facem dupa
    }

    //S8 Tc2: Test timer Alerts feature from the Alert sectioon
    @When("User clicks the timer alert button")
    public void userClicksTheTimerAlertButton(){
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.alTimerClickAlertButton().click();
        wait.until(ExpectedConditions.alertIsPresent());


        
    }

    @And("Close the timer alert box")
    public void closeTheTimerAlertBox() {
        Alert simplealert = driver.switchTo().alert();
        simplealert.accept();

    }

    @Then("Check if timer alert box is closed")
    public void checkIfTimerAlertBoxIsClosed() {
    }
    //S8 Tc3 : Test Confirm box appear feature from the Alert Section

    @When("User clicks the confirmation box alert button")
    public void userClicksTheConfirmationBoxAlertButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.alConfirmationBox().click();

    }

    @And("Close the timer confirmation box alert")
    public void closeTheTimerConfirmationBoxAlert() {
        Alert simplealert = driver.switchTo().alert();
        simplealert.accept();

    }

    @Then("Check if confirmation box is closed")
    public void checkIfConfirmationBoxIsClosed() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        String text = ("You selected Ok");
        Assert.assertEquals(text, demo.alConfirmationResult().getText());
        driver.quit();
    }

    //S8-TC4:Test the prompt box feature from the alerts section

    @When("User clicks the prompt box button")
    public void userClicksThePromptBoxButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.alClickPromptBoxbutton().click();
    }

    @And("User types some random text in the field")
    public void userTypesSomeRandomTextInTheField() {
        Alert alert = driver.switchTo().alert();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Molnar Levente");

    }

    @And("User closes the prompt box by clicking ok")
    public void userClosesThePromptBoxByClickingOk() {
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Then("Check if the prompt box is closed and if text is present")
    public void checkIfThePromptBoxIsClosedAndIfTextIsPresent() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        String succesmessage= "You entered Molnar Levente";
        String actualmessage = demo.alPromptSuccesMessage().getText();
        Assert.assertEquals(succesmessage, actualmessage);
        driver.quit();
    }

    //S9 Test the Slider Feature from the Widgets section
    @Given("The main Slider Page")
    public void theMainSliderPage() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlSlider"));
        driver.manage().window().maximize();

    }

    @When("User moves the slider at {int}%")
    public void userMovesTheSliderAt(int arg0) {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        sliderMethod(demo.slRangeSlider(),71);
    }

    @Then("Check if slider is at correct value")
    public void checkIfSliderIsAtCorrectValue() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        String value = demo.slSliderValue().getText();
        System.out.println(value);
        Assert.assertEquals("71", value);
        driver.quit();
    }

    //S10 Test the Progress Bar from the Widgets section
    @Given("The main Progress Bar page")
    public void theMainProgressBarPage() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlProgressBar"));
        driver.manage().window().maximize();
    }

    @When("User is pressing the Start Button")
    public void userIsPressingTheStartButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.pbStartButton().click();
    }

    @And("The progress bar is one hundred percent press the reset button")
    public void theProgressBarIsOneHundredPercentPressTheResetButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        wait.until(ExpectedConditions.elementToBeClickable(demo.pbResetButton()));
        demo.pbResetButton().click();
    }

    @Then("Check if the progress Bar was reset")
    public void checkIfTheProgressBarWasReset() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        String text = "Start";
        Assert.assertEquals(text,demo.pbStartButton().getText());
        System.out.println("A mers testul S10");
        driver.quit();
    }


    //#S11: Test the tool tips feature from the widgets section

    @Given("The main tool tips page")
    public void theMainToolTipsPage() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlToolTips"));
        driver.manage().window().maximize();}

    @When("User hovers over the Hover me to see button")
    public void userHoversOverTheHoverMeToSeeButton() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Actions hoverover = new Actions(driver);
        hoverover.moveToElement(demo.ttHoverMeButton()).perform();
        wait.until(ExpectedConditions.attributeToBe(demo.ttHoverMeButton(),"aria-describedby", "buttonToolTip"));}
    @Then("Check if {string} message is displayed")
    public void checkIfMessageIsDisplayed(String arg0) {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);    String expmessage = "buttonToolTip";
        String actualmessage = demo.ttHoverMeButton().getAttribute("aria-describedby");
        Assert.assertEquals(expmessage,actualmessage);
        System.out.println("S11: Test passed");
        driver.quit();
    }

    //S12 Test the login feature from the Book Store Section
    
    @Given("The main Login page")
    public void theMainLoginPage() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlLoginBookStore"));
        driver.manage().window().maximize();
    }

    @When("User register on the Book Store")
    public void userRegisterOnTheBookStore() throws InterruptedException {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.bsNewUserButton().click();
        demo.bsFirstName().sendKeys("Levente");
        demo.bsLastName().sendKeys("Molnar");
        demo.bsUserName().sendKeys("Tester");
        demo.bsPassword().sendKeys("Parola10!");
        driver.switchTo().frame(demo.bsCaptchaIframe());
        demo.bsCaptcha().click();
        Thread.sleep(15000);
        driver.switchTo().parentFrame();
        demo.bsRegisterButton().click();
        demo.bsBackToLogin().click();


        
    }

    @Then("User login with registered account")
    public void userLoginWithRegisteredAccount() {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        demo.bsUserName().sendKeys("Tester");
        demo.bsPassword().sendKeys("Parola10!");
        demo.bsLoginButton().click();
        demo.bsBookStoreButton().click();

    }

    //S12 TC2: Test the Search feature from the Book Store Section

    @Given("The main Book Store page")
    public void theMainBookStorePage() throws IOException {
        Base.initializeDriver();
        driver.get(prop.getProperty("baseUrlBookStoreProfile"));

    }

    @When("User searched a book")
    public void userSearchedABook() {

    }

    @Then("Check if the book was find it")
    public void checkIfTheBookWasFindIt() {
    }
}


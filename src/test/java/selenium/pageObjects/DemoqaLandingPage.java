package selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoqaLandingPage {
    public WebDriver driver;

    public DemoqaLandingPage(WebDriver driver) {this.driver = driver;}

    //Practice Form
    //pf-practice form
    //eb- element Button
    //bw - Browser windows
    //rs -Resizable

    By pfmain = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]"); //click on the main forms section
    By pfsecondary = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li"); //click on the secondary form section
    By pffirstname = By.id("firstName"); //send first name
    By pflastname = By.id("lastName"); //send lastname
    By pfemail = By.id("userEmail"); //send email
    By pfgenderbox = By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label"); //click the gender box
    By pfphonenumber = By.id("userNumber"); //send phone number
    By pfdateofbirthclick = By.id("dateOfBirthInput"); //click date of birth field
    By pfmonthselector = By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select"); //click month selector
    By pfselectmonthseptember = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[9]"); //select september
    By pfyearselector = By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select > select");//click year selector
    By pfselectyear1999 = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[100]");//select year 1999
    By pfselect9september = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]");//select 9 september date
    By pfsendkeyssubjectfield = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]/div[2]/div");//send keys to subject field
    By pfmusicbutton = By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label"); //selecytare Music button
    By pfuploadpicture = By.id("uploadPicture");
    By pfcurrentaddress = By.id("currentAddress"); //completare current address
    By pfselectstatebutton = By.id("state"); //click select state button
    By pfselectstate  = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[10]/div[2]/div/div/div[1]/div[2]/div/input");
    By pfselectcitybutton  = By.id("city");
    By pfselectcity = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[10]/div[3]/div/div/div[1]/div[2]/div/input");
    By pfsubmitbutton = By.id("submit");
    By pfcheckstudentname = By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]");
    By pfcheckemail = By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[2]/td[2]");

    //Scenario: Test the buttons feature from the elements section
    By ebdoubleclickme = By.id("doubleClickBtn");
    By ebrightclickme = By.id("rightClickBtn");
    By ebclickme = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    By ebdoubleclikmessage = By.id("doubleClickMessage");
    By ebrightclickmessage = By.id("rightClickMessage");
    By ebclickmessage = By.id("dynamicClickMessage");

    //#S3 Test the browser feature from the alerts section
    By bwnewtabbutton = By.id("tabButton");
    By bwnewtabmessage = By.id("sampleHeading");
    By bwnewwindowbutton = By.id("windowButton");
    By bwmessagewindowbutton = By.id("messageWindowButton");
    By bwnewwindowmessage = By.xpath("/html/body/text()");

    //S4:Test the auto complete feature from the widgets section
    By acmultiplecolorfield = By.id("autoCompleteMultipleInput");
    By acsinglecolorfield = By.id("autoCompleteSingleInput");
    By acmultiplered = By.cssSelector("div:nth-of-type(1) > .auto-complete__multi-value__label.css-12jo7m5");
    By acmultipleblue = By.cssSelector("div:nth-of-type(2) > .auto-complete__multi-value__label.css-12jo7m5");
    By acsinglecolorblackchech = By.cssSelector("[class='auto-complete__value-container auto-complete__value-container--has-value css-1hwfws3']");

    //S5--TC1: Test the droppable feature from the interactions section
    By ddsinmpledragelement = By.xpath("/html//div[@id='draggable']");
    By ddsinmpledropelement = By.xpath("/html//div[@id='droppable']");

    //TC2: Test the Accept droppable features from the interaction section
    By ddacceptbutton = By.id("droppableExample-tab-accept");
    By ddacceptabledragelement = By.xpath("/html//div[@id='acceptable']");
    By ddnotacceptabledragelement = By.xpath("/html//div[@id='notAcceptable']");
    By ddacceptabledropelement = By.xpath("//div[@id='acceptDropContainer']/div[@id='droppable']");

    //S6: Test the Resizable Feature from Interactions system
    By rsrestrictedresizablehandle = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div/span");
    By rscheckrestrictedhandle = By.cssSelector("#resizableBoxWithRestriction");

    //S7 Test the Sortable Feature from Interaction system
    By sroneelement = By.cssSelector("#demo-tabpane-list > div > div:nth-child(1)"); //click on the one element
    By srthreeelement = By.cssSelector("#demo-tabpane-list > div > div:nth-child(3)"); //click on the three element
    By srcheckelementischanged = By.xpath("//*[@id=\"demo-tabpane-list\"]/div"); //the whole list

    //S8: Test the Alerts feature from the Alert, frame and Windows
    By alclickalertbutton = By.id("alertButton");

    //S8 Tc2: Test timer Alerts feature from the Alert sectioon
    By altimerclickalertbutton = By.id("timerAlertButton");

    //S8 Tc3 : Test Confirm box appear feature from the Alert Section
    By alconfirmationbox = By.id("confirmButton");
    By alconfirmationresult = By.id("confirmResult");

    //S8-TC4:Test the prompt box feature from the alerts section
    By alclickpromptbox = By.id("promtButton"); //click the prompt box button
    By alpromptresult = By.id("promptResult"); //prompt result message

    //S9 Test the Slider Feature from the Widgets section
    By slrangeslider = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/form/div/div[1]/span/input");
    By slslidervalue = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/form/div/div[1]/span/div/div[1]");

    //S10 Test the Progress Bar from the Widgets section
    By pbstartbutton = By.id("startStopButton");
    By pbresetbutton = By.id("resetButton");

    //S11: Test the tool tips feature from the widgets section
    By tthovermetosee = By.id("toolTipButton"); //hover over the tool tips button

    //S12 TC1: Test the login feature from the Book Store Section
    By bsnewuserbutton = By.id("newUser");
    By bsfirstname = By.id("firstname");
    By bslastname = By.id("lastname");
    By bsusername = By.id("userName");
    By bspassword = By.id("password");
    By bscaptcha = By.cssSelector("span#recaptcha-anchor > div:nth-of-type(1)");
    By bscaptchaiframe = By.xpath("//*[@id=\"g-recaptcha\"]/div/div/iframe");
    By bsregisterbutton = By.id("register");
    By bsbacktologin = By.id("gotologin");
    By bsloginbutton = By.id("login");
    By bsbookstorebutton = By.id("gotoStore");

    //S12 TC2: Test the Search feature from the Book Store Section


    //Practice form
    public WebElement pfMain() {return driver.findElement(pfmain);} //click on the main form section
    public WebElement pfSecondary() {return driver.findElement(pfsecondary);} //click on the secndary step form section
    public WebElement pfFirstName() {return driver.findElement(pffirstname);} //send first name
    public WebElement pfLastname() {return driver.findElement(pflastname);} //send lastname
    public WebElement pfEmail() {return driver.findElement(pfemail);} //send email
    public WebElement pfGenderBox() {return driver.findElement(pfgenderbox);} //click the gender box
    public WebElement pfPhoneNumber() {return driver.findElement(pfphonenumber);} //send phone number
    public WebElement pfDateOfBirth() {return driver.findElement(pfdateofbirthclick);} //click date of birth fields
    public WebElement pfMonthSelector() {return driver.findElement(pfmonthselector);} //click month selector
    public WebElement pfMonthSelectSeptember() {return driver.findElement(pfselectmonthseptember);} //select month september
    public WebElement pfYearSelector() {return driver.findElement(pfyearselector);} //click year selector
    public WebElement pfSelectYear1999() {return driver.findElement(pfselectyear1999);} //select year 1999
    public WebElement pfSelect9September() {return driver.findElement(pfselect9september);} //select year 1999
    public WebElement pfSendKeysToSubjectField() {return driver.findElement(pfsendkeyssubjectfield);} //send keys to subject field
    public WebElement pfMusicButton() {return driver.findElement(pfmusicbutton);} //select music button
    public WebElement pfUploadPicture() {return driver.findElement(pfuploadpicture);}
    public WebElement pfCurrentAddress() {return driver.findElement(pfcurrentaddress);}
    public WebElement pfSelectStateButton() {return driver.findElement(pfselectstatebutton);} //click select state button
    public WebElement pfSelectState() {return driver.findElement(pfselectstate);}
    public WebElement pfSelectCityButton() {return driver.findElement(pfselectcitybutton);}
    public WebElement pfSelectCity() {return driver.findElement(pfselectcity);}
    public WebElement pfSubmitButton() {return driver.findElement(pfsubmitbutton);}
    public WebElement pfCheckStudentName() {    return driver.findElement(pfcheckstudentname);}
    public WebElement pfCheckEmail() {    return driver.findElement(pfcheckemail);}

    //Scenario: Test the buttons feature from the elements section
    public WebElement ebDoubleClickMe() {return  driver.findElement(ebdoubleclickme);}
    public WebElement ebRightClickMe() {return driver.findElement(ebrightclickme);}
    public WebElement ebClickMe() {return driver.findElement(ebclickme);}
    public WebElement ebDoubleClickMessage() {return driver.findElement(ebdoubleclikmessage);}
    public WebElement ebRightClickMessage() {return driver.findElement(ebrightclickmessage);}
    public WebElement ebClickMessage() {return driver.findElement(ebclickmessage);}

    //#S3 Test the browser feature from the alerts section
    public WebElement bwNewTabButton() {return driver.findElement(bwnewtabbutton);}
    public WebElement bwNewTabMessage() {return driver.findElement(bwnewtabmessage);}
    public WebElement bwNewWindowButton() {return driver.findElement(bwnewwindowbutton);}
    public WebElement bwMessageWindowButton() {return driver.findElement(bwmessagewindowbutton);}
    public WebElement bwNewWindowMessage() {return driver.findElement(bwnewwindowmessage);}

    //S4:Test the auto complete feature from the widgets section
    public WebElement acMultipleColorField() {return driver.findElement(acmultiplecolorfield);}
    public WebElement acSingleColorField() {return driver.findElement(acsinglecolorfield);}
    public WebElement acMultipleColorRedCheck() {return driver.findElement(acmultiplered);}
    public WebElement acMultipleColorBlueCheck() {return driver.findElement(acmultipleblue);}
    public WebElement acSingleColorBlackCheck() {return driver.findElement(acsinglecolorblackchech);}

    //S5--TC1: Test the droppable feature from the interactions section
    public WebElement ddSimpleDragElement() {return driver.findElement(ddsinmpledragelement);}
    public WebElement ddSimpleDropElement() {return driver.findElement(ddsinmpledropelement);}

    //TC2: Test the Accept droppable features from the interaction section
    public WebElement ddAcceptButton() {return driver.findElement(ddacceptbutton);}
    public WebElement ddAcceptableDragElement() {return driver.findElement(ddacceptabledragelement);}
    public WebElement ddNotAcceptableDragElement() {return driver.findElement(ddnotacceptabledragelement);}
    public WebElement ddAcceptableDropElement() {return driver.findElement(ddacceptabledropelement);}

    //S6: Test the Resizable Feature from Interactions system
    public WebElement rsRestrictedResizableHandle() {return driver.findElement(rsrestrictedresizablehandle);}
    public WebElement rsCheckRestrictedResizable() {return driver.findElement(rscheckrestrictedhandle);} //check restricted handle

    //S7 Test the Sortable Feature from Interaction system
    public WebElement srOneElement() {return driver.findElement(sroneelement);} //click on the one element
    public WebElement srThreeElement() {return driver.findElement(srthreeelement);} //click on the three element
    public WebElement srListOfNumbers() {return driver.findElement(srcheckelementischanged);} //the whole list

    //S8: Test the Alerts feature from the Alert, frame and Windows
    public WebElement alClickAlertButton() {return driver.findElement(alclickalertbutton);} //click the alert button

    //S8 Tc2: Test timer Alerts feature from the Alert sectioon
    public WebElement alTimerClickAlertButton() {return driver.findElement(altimerclickalertbutton);}

    //S8 Tc3 : Test Confirm box appear feature from the Alert Section
    public WebElement alConfirmationBox() {return driver.findElement(alconfirmationbox);}
    public WebElement alConfirmationResult() {return driver.findElement(alconfirmationresult);}

    //S8-TC4:Test the prompt box feature from the alerts section
    public WebElement alClickPromptBoxbutton() {    return driver.findElement(alclickpromptbox);} //click the prompt box button
    public WebElement alPromptSuccesMessage() {    return driver.findElement(alpromptresult);} //prompt result message

    //S9 Test the Slider Feature from the Widgets section
    public WebElement slRangeSlider() {return driver.findElement(slrangeslider);}
    public WebElement slSliderValue() {return driver.findElement(slslidervalue);}

    //S10 Test the Progress Bar from the Widgets section
    public WebElement pbStartButton() {return driver.findElement(pbstartbutton);}
    public WebElement pbResetButton() {return driver.findElement(pbresetbutton);}

    //S11: Test the tool tips feature from the widgets section
    public WebElement ttHoverMeButton() {return driver.findElement(tthovermetosee);} //hover over the tool tips button

    //S12 TC1: Test the login feature from the Book Store Section
    public WebElement bsNewUserButton() {return driver.findElement(bsnewuserbutton);} //new user button
    public WebElement bsFirstName() {return driver.findElement(bsfirstname);} //First name field
    public WebElement bsLastName() {return driver.findElement(bslastname);} //Last name field
    public WebElement bsUserName() {return driver.findElement(bsusername);} //Username field
    public WebElement bsPassword() {return driver.findElement(bspassword);} //Password field
    public WebElement bsCaptcha() {return driver.findElement(bscaptcha);}  //Captcha click
    public WebElement bsCaptchaIframe() {return driver.findElement(bscaptchaiframe);} //Captcha frame
    public WebElement bsRegisterButton() {return driver.findElement(bsregisterbutton);} //Register new user button
    public WebElement bsBackToLogin() {return driver.findElement(bsbacktologin);} //Back to login page button
    public WebElement bsLoginButton() {return driver.findElement(bsloginbutton);} //Login button
    public WebElement bsBookStoreButton() {return driver.findElement(bsbookstorebutton);}  //Book Store button

    //S12 TC2: Test the Search feature from the Book Store Section




}


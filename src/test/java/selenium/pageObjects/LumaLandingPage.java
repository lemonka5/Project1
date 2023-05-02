package selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LumaLandingPage {
    public WebDriver driver;
    public LumaLandingPage(WebDriver driver) {this.driver = driver;}
    By signIn = By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.authorization-link > a");
    By typeemail = By.id("email");
    By typepassword = By.id("pass");
    By clicksigninfinal =By.cssSelector("#send2");
    By clickbuttonmen = By.id("ui-id-5");
    By clickbuttontanks = By.cssSelector("#maincontent > div.columns > div.sidebar.sidebar-main > div.widget.block.block-static-block > div > ul:nth-child(2) > li:nth-child(4) > a");
    By buttonatlastanksizel = By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[2]/div[1]/div/div[4]");
    By buttonatlastankcolourblue = By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[2]/div[2]/div/div");
    By clikbuttonaddtocart = By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[3]/div/div[1]/form/button");
    By addtocartmessage = By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div");
    public WebElement clicksignin() {return driver.findElement(signIn);}
    public WebElement typeEmail() { return driver.findElement(typeemail);}
    public WebElement typePassword() { return driver.findElement(typepassword);}
    public WebElement clickSigninFinal() { return driver.findElement(clicksigninfinal);}
    public WebElement clickButtonMen() {return driver.findElement(clickbuttonmen);}
    public WebElement clickButtonTanks() {return driver.findElement(clickbuttontanks);}
    public WebElement buttonAtlasTankSizeL() {return driver.findElement(buttonatlastanksizel);}
    public WebElement buttonAtlasTankColourBlue() {return driver.findElement(buttonatlastankcolourblue);}
    public WebElement clickButtonAddToCart() {return driver.findElement(clikbuttonaddtocart);}
    public WebElement addToCartMessage() {return driver.findElement(addtocartmessage);}



}

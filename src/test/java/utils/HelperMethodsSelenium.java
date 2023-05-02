package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.pageObjects.DemoqaLandingPage;

import static utils.Base.driver;

public class HelperMethodsSelenium {

    public static void sliderMethod(WebElement web, int percentage) {
        DemoqaLandingPage demo = new DemoqaLandingPage(driver);
        Actions slider = new Actions(driver);
        slider.moveToElement(demo.slRangeSlider(), (-demo.slRangeSlider().getRect().width/2), 0 )
                .moveByOffset( (percentage * demo.slRangeSlider().getRect().width/100), 0)
                .click().build().perform();
    }
}

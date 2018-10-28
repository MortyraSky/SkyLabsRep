package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseStep {
    protected WebDriver driver;
    private int timeoutWait = 10;

    BaseStep(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement waitForElementClicable(WebElement element) {
        (new WebDriverWait(driver, timeoutWait))
                .until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public void frameToBeAvailableAndSwitchToIt(int frameLocator){
        (new WebDriverWait(driver, timeoutWait))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator)); //.frameToBeAvailableAndSwitchToIt(frameLocator)
    }
}

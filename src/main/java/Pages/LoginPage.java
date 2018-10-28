package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "input[name='login']")
    public WebElement loginField;

    @FindBy(css = "input[name='password']")
    public WebElement passwordField;

    @FindBy(css = "label[name='clb615190']")
    public WebElement enterBtn;

    @FindBy(css = "i[id='PH_user-email']")
    public WebElement userNameOnSite;

    @FindBy(id = "PH_logoutLink")
    public WebElement exitFromMailBox;

}

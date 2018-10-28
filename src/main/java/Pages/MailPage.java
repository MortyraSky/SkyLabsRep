package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {

    public MailPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    private WebDriver driver;

    @FindBy(css = "a[data-shortcut-title='N']")
    public WebElement writeMailBtn;

    @FindBy(css = "textarea[data-original-name='To']")
    public WebElement sendToField;

    @FindBy(css = "input[name='Subject']")
    public WebElement themeField;

    @FindBy(css = "div[data-name='send']")
    public WebElement sendMailBtn;

    @FindBy(css = "iframe")
    public WebElement iFrame;

    @FindBy(css = ".message-sent__info")
    public WebElement recipientMail;

    @FindBy(id = "PH_logoutLink")
    public WebElement exitFromMailBox;
}

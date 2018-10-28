package Steps;

import Pages.MailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailStep extends BaseStep {

    MailPage mailPage = new MailPage(driver);
    private String writteMessage;
    private String recipient;

    public MailStep(WebDriver driver){
        super(driver);
    }

    public void filingInTheMainFields(String subject, String theme){
        waitForElementClicable(mailPage.writeMailBtn).click();
        waitForElementClicable(mailPage.sendToField).sendKeys(subject);
        mailPage.themeField.sendKeys(theme);

    }

    public void writeMessage(String message){
        driver.switchTo().frame(mailPage.iFrame);
        WebElement body = driver.findElement(By.id("tinymce"));
        body.sendKeys(message);
        writteMessage = body.getText().substring(0,message.length());
        driver.switchTo().defaultContent();
    }

    public boolean checkWrittingMsg(String msg){
        if (writteMessage.matches(msg+"(.*)"))
            return true;
        return false;
    }

    public void sendMail(){
        mailPage.sendMailBtn.click();
        recipient = waitForElementClicable(mailPage.recipientMail).getText();
    }

    public boolean checkSendingMessage(String subject){
        if (recipient.equals(subject))
            return true;
        return false;
    }
    public void logout(){
        waitForElementClicable(mailPage.exitFromMailBox).click();
    }
}

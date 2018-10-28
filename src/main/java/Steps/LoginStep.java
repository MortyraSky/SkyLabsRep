package Steps;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginStep extends BaseStep {

    private LoginPage loginPage = new LoginPage(driver);

    public LoginStep(WebDriver driver){
        super(driver);
    }

    public void navigate(String URL) {
        driver.get(URL);
        System.out.println("Переход на: " + URL);

    }

    public void successAuth(String login, String password){
        loginPage.loginField.sendKeys(login);
        loginPage.passwordField.sendKeys(password);
        loginPage.enterBtn.click();

    }

    public boolean checkUsername(String login){

        String userName = waitForElementClicable(loginPage.userNameOnSite).getText();

        if (userName.equals(login))
            return true;
        return false;
    }

    public void logout(){
        loginPage.exitFromMailBox.click();
    }

}

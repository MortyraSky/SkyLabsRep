package com.github.MortyraSky.Tests;

import Steps.LoginStep;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigProperties;

public class LoginTest extends BaseTest {


    @Test(priority = 0)
    public void authInMailRU(){
        LoginStep loginStep = new LoginStep(driver);
        loginStep.navigate(ConfigProperties.getTestProperty("URL"));
        loginStep.successAuth(ConfigProperties.getTestProperty("LOGIN"), ConfigProperties.getTestProperty("PASSWORD"));
        Assert.assertTrue(loginStep.checkUsername(ConfigProperties.getTestProperty("LOGIN")));
        loginStep.logout();
    }

}

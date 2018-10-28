package com.github.MortyraSky.Tests;


import Steps.LoginStep;
import Steps.MailStep;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigProperties;

public class MailTest extends BaseTest {


    @Test(priority = 0)
    public void writeAndSendMessageTest(){
        LoginStep loginStep = new LoginStep(driver);
        loginStep.navigate(ConfigProperties.getTestProperty("URL"));
        loginStep.successAuth(ConfigProperties.getTestProperty("LOGIN"), ConfigProperties.getTestProperty("PASSWORD"));

        MailStep mailStep = new MailStep(driver);
        mailStep.filingInTheMainFields(ConfigProperties.getTestProperty("SUBJECT"), ConfigProperties.getTestProperty("THEME"));
        mailStep.writeMessage(ConfigProperties.getTestProperty("MESSAGE"));
        Assert.assertTrue(mailStep.checkWrittingMsg(ConfigProperties.getTestProperty("MESSAGE")));
        mailStep.sendMail();
        Assert.assertTrue(mailStep.checkSendingMessage(ConfigProperties.getTestProperty("SUBJECT")));
        mailStep.logout();

    }



}

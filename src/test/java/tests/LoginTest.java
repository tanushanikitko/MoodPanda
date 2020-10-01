package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @Test
    public void correctLoginTest(){
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);

    }
}

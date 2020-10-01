package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage  extends BasePage{
    public static final By START_BUTTON = By.cssSelector(".brand-name-subtext > .btn.btn-outline-light.hidden-height-570.page-scroll");
    public  static final By USERNAME_INPUT = By.cssSelector("input#ContentPlaceHolderContent_TextBoxEmail");
    public  static final By PASSWORD_INPUT = By.cssSelector("input#ContentPlaceHolderContent_TextBoxPassword");
    public  static final By LOGIN_BUTTON = By.cssSelector("input#ContentPlaceHolderContent_ButtonLogin");

    public LoginPage() {
        super();
    }


    public void  openPage() {
        open("https://moodpanda.com/");
    }
    public void login(String username,String password) {
        $(START_BUTTON).click();
        $(USERNAME_INPUT).sendKeys(username);
        $(PASSWORD_INPUT).sendKeys(password);
        $(LOGIN_BUTTON).click();


    }
}
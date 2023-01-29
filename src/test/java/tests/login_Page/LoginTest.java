package tests.login_Page;

import common.config.AppConfigProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void openLoginPage() {
        brManager.reloadPage();
        navigation.goToLoginPage();
    }

    @Test(description = "Все поля валидные")
    public void successfulLoginTest() {
        signinPage.insertLogin(AppConfigProvider.get().userLogin());
        signinPage.insertPassword(AppConfigProvider.get().userPassword());
        signinPage.clickLoginButton();
        Assert.assertTrue(confirmationPage.isDisplayed());
    }

    @Test(description = "Все поля пустые")
    public void emptyFields() {
        signinPage.clickLoginButton();
        Assert.assertTrue(errorMessagePage.isDisplayed());
    }

    @Test(description = "Поле пороль пустьое")
    public void oneEmptyField() {
        signinPage.insertLogin(AppConfigProvider.get().userLogin());
        signinPage.clickLoginButton();
        Assert.assertTrue(errorMessagePage.isDisplayed());
    }

    @Test(description = "Невалидные логин и пороль")
    public void notValidLoginAndPassword() {
        signinPage.insertLogin(AppConfigProvider.get().invalidLogin());
        signinPage.insertPassword(AppConfigProvider.get().invalidPassword());
        signinPage.clickLoginButton();
        Assert.assertTrue(errorMessagePage.isDisplayed());
    }
}

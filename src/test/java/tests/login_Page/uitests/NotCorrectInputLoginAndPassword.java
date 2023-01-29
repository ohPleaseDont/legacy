package tests.login_Page.uitests;

import common.config.AppConfigProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.login_Page.LoginTest;

public class NotCorrectInputLoginAndPassword extends LoginTest {
    /*
    1. Зайти на страницу https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=
        https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2
        Fprefetch&force_new_session=true; - OP:  Открывается страница авторизации.
    2. Заполнить поле для ввода логина латинскими символами "ddds" и поле для ввода пороля "5555",
     нажать кнопку Войти; - ОР: появилась информация о не корректном вводе данных.
    */
    @Test
    public void notCorrectInputLoginAndPassword() {
        Assert.assertEquals(signinPage.getTitle(), "Интернет банк - Банк Санкт-Петербург");
        signinPage.insertLogin(AppConfigProvider.get().notCorrectLogin());
        signinPage.insertPassword(AppConfigProvider.get().notCorrectPassword());
        signinPage.clickLoginButton();
        Assert.assertTrue(signinPage.isAlertDisplayed());
    }
}

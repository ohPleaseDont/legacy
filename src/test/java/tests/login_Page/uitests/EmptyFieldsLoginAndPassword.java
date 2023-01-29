package tests.login_Page.uitests;

import common.config.AppConfigProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.login_Page.LoginTest;

public class EmptyFieldsLoginAndPassword extends LoginTest {

    /*
1. Зайти на страницу https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=
https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2
Fprefetch&force_new_session=true; - OP:  Открывается страница авторизации.
2. Оставить поле для ввода логина и пороля незаполненным, нажать кнопку Войти; - ОР: Переход на следующую страницу не 
осуществился, появилась информация о не корректном вводе данных
*/
    @Test
    public void emptyField() {
        signinPage.insertLogin(AppConfigProvider.get().empty());
        signinPage.insertPassword(AppConfigProvider.get().empty());
        signinPage.clickLoginButton();
        Assert.assertTrue(signinPage.isAlertDisplayed());
    }
}

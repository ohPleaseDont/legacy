package tests.login_Page.uitests;

import common.config.AppConfigProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.login_Page.LoginTest;

public class CorrectInputDataLoginAndPasswordAndCode extends LoginTest {

    /*
1. Зайти на страницу https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=
https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2
Fprefetch&force_new_session=true; - OP:  Открывается страница авторизации.
2. Заполнить поле для ввода логина и пороля валидными данными, нажать кнопку Войти; - ОР: Осуществляется переход
на следующую страницу для ввода кода
3. Заполнить поле для ввода кода из СМС валидным значением. ОР: Осуществляется переход на главную страницу сайта
*/
    @Test
    public void correctInputDataLoginAndPasswordAndCode() {
        navigation.goToDemoPage();
        Assert.assertEquals(signinPage.getTitle(), "Интернет банк - Банк Санкт-Петербург");
        signinPage.insertLogin(AppConfigProvider.get().userLogin());
        signinPage.insertPassword(AppConfigProvider.get().userPassword());
        signinPage.clickLoginButton();
        signinPage.inputCode(AppConfigProvider.get().userCode());
        signinPage.clickLoginOtp();
    }
}
package common.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:application.properties"})
public interface AppConfig extends Config {

    @Key("sign.url")
    String signUrl();

    @Key("user.login")
    String userLogin();

    @Key("user.password")
    String userPassword();

    @Key("invalid.login")
    String invalidLogin();

    @Key("invalid.password")
    String invalidPassword();

    @Key("title")
    String title();

    @Key("user.code")
    String userCode();

    @Key("empty")
    String empty();

    @Key("not.correct.login")
    String notCorrectLogin();

    @Key("not.correct.password")
    String notCorrectPassword();
}
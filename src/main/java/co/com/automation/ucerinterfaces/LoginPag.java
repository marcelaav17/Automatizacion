package co.com.automation.ucerinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginPag {
    public static final Target IMP_USER_NAME = Target.the("imput login user name").located(By.xpath("/html/body/div/div[2]/form/input[1]"));
    public static final Target IMP_PASSWORD = Target.the("imput login password").located(By.xpath("/html/body/div/div[2]/form/input[2]"));
    public static final Target BTN_LOGIN = Target.the("boton de login").located(By.xpath("/html/body/div/div[2]/form/button"));
}

package co.com.automation.ucerinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class FormularioPag {
    public static final Target CHEK_MULTIPLO150 = Target.the(" multiplo de 2").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[1]/input"));
    public static final Target CHEK_MULTIPLO118 = Target.the("multiplo de 2").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[3]/input"));
    public static final Target CHEK_MULTIPLO138 = Target.the("multiplo de 2").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[7]/input"));
    public static final Target CHEK_MULTIPLO70 = Target.the("multiplo de 2").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[11]/input"));
    public static final Target CHEK_MULTIPLO104 = Target.the("multiplo de 2").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[13]/input"));
    public static final Target CHEK_MULTIPLO18 = Target.the("multiplo de 2").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[14]/input"));
    public static final Target CHEK_MULTIPLO78 = Target.the("multiplo de 2").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[16]/input"));
    public static final Target CHEK_MULTIPLO146 = Target.the("multiplo de 2").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[17]/input"));
    public static final Target CHEK_MULTIPLO180 = Target.the("multiplo de 9").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[2]/input"));
    public static final Target CHEK_MULTIPLO69 = Target.the("multiplo de 9").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/div/label[3]/input"));

    public static final Target CHEK_OPERACION = Target.the("142+54-70*30-151+274+296*295").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/label[1]/input"));
    public static final Target CHEK_OPERACION2 = Target.the("83+151-115*91-156*24").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/label[5]/input"));

    public static final Target TEXT_INPUT_FIELD = Target.the("imput escribir L").located(By.xpath("/html/body/div[2]/form/div[1]/div[3]/textarea"));

    public static final Target DATE_CALENDARIO = Target.the("fecha del calendario").located(By.xpath("//input[@name='date']"));

    public static final Target BTN_ENVIAR = Target.the("boton enviar").located(By.xpath("/html/body/div[2]/form/div[2]/button"));
    public static final Target MENSAJE_CONT = Target.the("mensaje").located(By.xpath("/html/body/div[2]/div/div/div[2]/p[2]"));


}

package co.com.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

import static co.com.automation.ucerinterfaces.FormularioPag.MENSAJE_CONT;

public class ValidarRespuesta implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElement mensajeElement = MENSAJE_CONT.resolveFor(actor);
        return mensajeElement.isDisplayed();
    }

    public static ValidarRespuesta message() {
        return new ValidarRespuesta();
    }
}

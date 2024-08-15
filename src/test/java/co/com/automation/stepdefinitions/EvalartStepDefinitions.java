package co.com.automation.stepdefinitions;

import co.com.automation.models.Datos;
import co.com.automation.questions.ValidarRespuesta;
import co.com.automation.tasks.CompletarForm;
import co.com.automation.tasks.VerificarLogin;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static co.com.automation.utils.Constants.BASE_URL;

public class EvalartStepDefinitions {
    @Managed
    WebDriver driver;

    @DataTableType
    public Datos defineDatos(Map<String, String> entry) {
        return new Datos(entry.get("userName"), entry.get("password"));

    }

    @Before
    public void configurar() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Automatizador");

    }

    @Dado("que el usuario está en la página de inicio de sesión")
    public void queElUsuarioEstáEnLaPáginaDeInicioDeSesión() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(BASE_URL));
    }

    @Cuando("el usuario inicia sesión con credenciales válidas")
    public void elUsuarioIniciaSesiónConCredencialesVálidas(List<Datos> datos) {
        Datos credenciales = datos.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerificarLogin.conCredenciales(credenciales.getUserName(), credenciales.getPassword())
        );

    }

    @Entonces("el usuario completa el formulario 10 veces")
    public void elUsuarioCompletaElFormulario10Veces(){
        LocalDate dateToSelect = LocalDate.of(2024, 4, 27);
        OnStage.theActorInTheSpotlight().attemptsTo(CompletarForm.completar(dateToSelect));
    }

    @Y("el usuario valida el hash de éxito {string}")
    public void elUsuarioValidaElHashDeExito(String mensaje){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRespuesta.message(), Matchers.is(true)));

    }
}

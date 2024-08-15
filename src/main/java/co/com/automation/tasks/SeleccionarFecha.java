package co.com.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.interactions.Actions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static co.com.automation.ucerinterfaces.FormularioPag.DATE_CALENDARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFecha implements Task {
    private final LocalDate dateToSelect;

    public SeleccionarFecha(LocalDate dateToSelect) {
        this.dateToSelect = dateToSelect;
    }

    public static SeleccionarFecha on(LocalDate date) {
        return instrumented(SeleccionarFecha.class, date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String formattedDate = dateToSelect.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actions.moveToElement(DATE_CALENDARIO.resolveFor(actor), 10, 22).click().perform();
        actor.attemptsTo(
                Enter.theValue(formattedDate).into(DATE_CALENDARIO)
        );
    }
}

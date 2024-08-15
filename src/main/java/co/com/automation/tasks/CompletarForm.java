package co.com.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.LocalDate;

import static co.com.automation.ucerinterfaces.FormularioPag.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarForm implements Task {
    private final LocalDate dateToSelect;

    public CompletarForm(LocalDate dateToSelect) {
        this.dateToSelect = dateToSelect;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String repeatedText = "L".repeat(241);
        String repeatedText2 = "A".repeat(161);
        LocalDate dateToSelect2 = LocalDate.of(2024, 6, 29);
        actor.attemptsTo(
                Click.on(CHEK_MULTIPLO150),
                Click.on(CHEK_MULTIPLO118),
                Click.on(CHEK_MULTIPLO138),
                Click.on(CHEK_MULTIPLO70),
                Click.on(CHEK_MULTIPLO104),
                Click.on(CHEK_MULTIPLO18),
                Click.on(CHEK_MULTIPLO78),
                Click.on(CHEK_MULTIPLO146),
                Click.on(CHEK_OPERACION),
                Enter.theValue(repeatedText).into(TEXT_INPUT_FIELD),
                Click.on(DATE_CALENDARIO),
                SeleccionarFecha.on(dateToSelect),
                Click.on(BTN_ENVIAR),
                SeleccionarFecha.on(dateToSelect),
                Click.on(BTN_ENVIAR),
                Click.on(CHEK_MULTIPLO180),
                Click.on(CHEK_MULTIPLO69),
                Click.on(CHEK_OPERACION2),
                Enter.theValue(repeatedText2).into(TEXT_INPUT_FIELD),
                Click.on(DATE_CALENDARIO),
                SeleccionarFecha.on(dateToSelect2),
                Click.on(BTN_ENVIAR),
                SeleccionarFecha.on(dateToSelect2),
                Click.on(BTN_ENVIAR)
        );

    }

    public static CompletarForm completar(LocalDate dateToSelect) {
        return instrumented(CompletarForm.class, dateToSelect);
    }
}

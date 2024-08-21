package com.banistmo.certification.website.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banistmo.certification.website.userinterfaces.AcercaDeNosotrosUI.*;

public class Ingresar implements net.serenitybdd.screenplay.Task {

    public Ingresar() {
    }

    public static Ingresar aSostenibilidad() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TAB_ACERCA_DE_NOSOTROS),
                WaitUntil.the(TAB_INF_CORPORATIVA,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LINK_SOSTENIBILIDAD)
        );
    }
}

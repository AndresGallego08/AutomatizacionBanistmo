package com.banistmo.certification.website.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.banistmo.certification.website.userinterfaces.AcercaDeNosotrosUI.LBL_QUE_SIGNIFICA_SOSTENIBILIDAD;

public class ElMensaje implements Question<String> {

    public static ElMensaje deConfirmacion() {
        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_QUE_SIGNIFICA_SOSTENIBILIDAD).viewedBy(actor).asString();
    }
}

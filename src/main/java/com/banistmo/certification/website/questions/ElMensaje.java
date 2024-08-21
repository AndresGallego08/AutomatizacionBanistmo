package com.banistmo.certification.website.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElMensaje implements Question<String> {

    public static ElMensaje deConfirmacion() {
        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}

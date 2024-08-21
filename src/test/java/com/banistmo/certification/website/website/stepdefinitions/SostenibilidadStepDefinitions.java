package com.banistmo.certification.website.website.stepdefinitions;

import com.banistmo.certification.website.exceptions.ErrorRedireccionamientoException;
import com.banistmo.certification.website.questions.ElMensaje;
import com.banistmo.certification.website.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static com.banistmo.certification.website.utils.UrlCertificacion.BANISTMO_CERTIFICATION_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class SostenibilidadStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void config() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new Cast());
        theActorCalled("User");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que el usuario esta en la pagina de banistmo$")
    public void queElUsuarioAbreLaUrl() {
        theActorInTheSpotlight().wasAbleTo(Open.url(BANISTMO_CERTIFICATION_URL));
    }

    @Cuando("^ingresa a la opcion de sostenibilidad$")
    public void ingresaASostenibilidad() {
        theActorInTheSpotlight().attemptsTo(Ingresar.aSostenibilidad());
    }

    @Entonces("^puede ver el mensaje (.*)$")
    public void puedeVerElMensajeDeConfirmacion(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ElMensaje.deConfirmacion(), Matchers.containsString(mensaje)).
                orComplainWith(ErrorRedireccionamientoException.class, "No se pudo validar conrrectamente el mensaje: " + mensaje));
    }

}

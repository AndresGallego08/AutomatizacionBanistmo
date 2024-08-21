package com.banistmo.certification.website.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AcercaDeNosotrosUI extends PageObject {

    public static final Target TAB_ACERCA_DE_NOSOTROS = Target.the("Tab Acerca de Nosotros").
            locatedBy("//a[contains(text(),'Acerca de nosotros')]");
    public static final Target TAB_INF_CORPORATIVA = Target.the("Tab Información Corporativa").
            locatedBy("//a[contains(text(),'Información Corporativa')]");
    public static final Target LINK_SOSTENIBILIDAD = Target.the("Enlace redireccionamiento a opción: Sostenibilidad").
            locatedBy("//a[contains(text(),'Sostenibilidad')]");

}

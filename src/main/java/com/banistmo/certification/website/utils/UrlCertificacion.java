package com.banistmo.certification.website.utils;

import java.util.ResourceBundle;

public class UrlCertificacion {

    public static final String BANISTMO_CERTIFICATION_URL = ResourceBundle.getBundle("Data_es_ES")
            .getString("certificationURL");

    private UrlCertificacion() {
        throw new IllegalStateException("Utility class");
    }
}



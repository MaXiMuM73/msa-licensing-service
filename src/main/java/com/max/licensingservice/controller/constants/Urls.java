package com.max.licensingservice.controller.constants;

public interface Urls {

    String SERVICE_NAME = "licensing-service";
    String SERVICE_DESCRIPTION = "Microservice - licensing service.";
    String ROOT = Api.NAME + "/" + Api.VERSION + "/" + SERVICE_NAME;

    interface Api {
        String NAME = "api";
        String VERSION = "v1";

    }
}

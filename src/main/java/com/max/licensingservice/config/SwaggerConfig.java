package com.max.licensingservice.config;

import com.max.licensingservice.controller.constants.Urls;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicUserApi() {
        return GroupedOpenApi.builder()
                .group("Users")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info().title("Licensing service")
                        .version(Urls.Api.VERSION)
                        .description(Urls.SERVICE_DESCRIPTION)
                        .contact(new Contact()
                                .name("Maksim S")
                                .email("maksim@gmail.com")));
    }
}

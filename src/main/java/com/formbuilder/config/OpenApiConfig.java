package com.formbuilder.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Form Builder APIs",
                description = "The Form Builder project is a web application developed with" +
                        " Spring Boot, allowing users to create and manage custom forms " +
                        "through an intuitive interface ",
                termsOfService = "T&C",
                contact = @Contact(
                        name = "help desk",
                        email = "helpdesk@piserve.com"
                ),
                version = "v1.0.0"
        )
)
@Configuration
public class OpenApiConfig {
}

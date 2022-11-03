package com.heroku.demo.config;

import static springfox.documentation.builders.PathSelectors.regex;

import com.heroku.demo.controller.HelloController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String ALL_CHILD = ".*";

    private ApiInfo metadata() {
        return new ApiInfoBuilder().title("Swagger Demo").description("API reference guide for developers")
                .termsOfServiceUrl("https://github.com/NLTTam").contact(new Contact("", "", "tamnlt2000@gmail.com"))
                .version("1.0").build();
    }

    @Bean
    public Docket helloApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Hello API").apiInfo(metadata()).select()
                .paths(regex(HelloController.ROOT_PATH + ALL_CHILD)).build();

    }
}

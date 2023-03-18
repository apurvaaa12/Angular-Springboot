/*package com.connect.Register.Swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final Set<String> PRODUCES = new HashSet<>(Arrays.asList("application/json"));
    private static final Set<String> CONSUMES = new HashSet<>(Arrays.asList("path parameter"));

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .produces(PRODUCES)
                .consumes(CONSUMES)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.connect.Register"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Register Service API",
                "Register Service",
                "",
                "",
                new Contact("Apurva","",""),
                "Apurva", "", Collections.emptyList());
    }

}
*/
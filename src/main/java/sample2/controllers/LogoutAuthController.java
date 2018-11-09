package sample2.controllers;


import java.util.HashMap;
import java.util.Map;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.micronaut.views.View;

@Controller("/lo")
@Secured(SecurityRule.IS_ANONYMOUS)
public class LogoutAuthController {

    @Get("/") 
    @View("logout") 
    public Map<String, Object> auth() {
        return new HashMap<>();
    }
}
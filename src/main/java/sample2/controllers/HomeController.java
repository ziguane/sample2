package sample2.controllers;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.micronaut.views.View;

@Controller("/")
@Secured(SecurityRule.IS_ANONYMOUS)
public class HomeController {

	@Get("/")
	@View("index")
	@Secured(SecurityRule.IS_AUTHENTICATED)
	Map<String, Object> index(@Nullable Principal principal) {
		return new HashMap<>();
	}

	@Get("/unauthorized")
	@View("unauthorized")
	Map<String, Object> unauthorized(@Nullable Principal principal) {
		return new HashMap<>();
	}

	@Get("/forbidden")
	@View("forbidden")
	Map<String, Object> forbidden(@Nullable Principal principal) {
		return new HashMap<>();
	}
}
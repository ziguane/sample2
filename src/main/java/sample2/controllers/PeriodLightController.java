package com.erelav.gvhr.controllers;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.micronaut.views.View;

@Controller("/periods")
@Secured(SecurityRule.IS_ANONYMOUS)
public class PeriodLightController {
	
	@Get("/list/my")
	@View("periods/my")
	@Secured(SecurityRule.IS_AUTHENTICATED)
	Map<String, Object> myPeriods(@Nullable Principal principal) {
		Map<String, Object> data = new HashMap<>();
		return data;
	}
}

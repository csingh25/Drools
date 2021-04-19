package com.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drools.model.LifePlanCase;
import com.drools.model.SingleLifePlanCase;
import com.drools.service.UWService;

@RestController
public class UWController {

	private final UWService uwService;

	@Autowired
	public UWController(UWService uwService) {
		this.uwService = uwService;
	}

	@RequestMapping(value = "/eligibility", method = RequestMethod.POST, produces = "application/json")
	public SingleLifePlanCase getQuestions(@RequestBody SingleLifePlanCase planCase ) {
		uwService.getProductPremium(planCase);
		return planCase;
	}
}

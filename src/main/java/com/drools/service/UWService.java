package com.drools.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drools.model.LifePlanCase;
import com.drools.model.SingleLifePlanCase;

@Service
public class UWService {

	
	@Autowired
	private KieSession session;

	public SingleLifePlanCase getProductPremium(SingleLifePlanCase product) {
		//get the stateful session
		//KieSession kieSession = kieContainer.newKieSession("rulesSession");
		session.insert(product);
		session.fireAllRules();
		session.dispose();
		return product;
	}
}

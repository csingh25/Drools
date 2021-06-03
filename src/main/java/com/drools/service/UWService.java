package com.drools.service;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drools.model.SingleLifePlanCase;

@Service
public class UWService {

	
	@Autowired
	private KieSession session;
	private static Logger log =  Logger.getLogger(UWService.class);

	public SingleLifePlanCase getProductPremium(SingleLifePlanCase product) {
		//get the stateful session
		//KieSession kieSession = kieContainer.newKieSession("rulesSession");
		try {
			
			session.addEventListener(new DefaultAgendaEventListener() {
                 
	                //this event will be executed after the rule matches with the model data
				 	
	                public void afterMatchFired(AfterMatchFiredEvent event) {
	                    super.afterMatchFired(event);
	                    log.info(event.getMatch().getRule().getName());///prints the rule name that fires the event 
	                }
	                
	            });
			session.insert(product);
			session.getAgenda().getAgendaGroup(product.getName()).setFocus();
			session.fireAllRules();
			session.dispose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product;
	}
	
	
}


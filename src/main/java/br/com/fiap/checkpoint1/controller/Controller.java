package br.com.fiap.checkpoint1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	
	@Value("${spring.profiles.active:}")
		private String myProfile;


	   @GetMapping("/ping")
	    public String ping() {
	        if (myProfile.equals("dev")) {
	            return "Pong em dev";
	        }else if(myProfile.equals("stg")) {
	            return "Pong em stg";
	        }else if(myProfile.equals("prd")) {
	            return "Pong em prd";
	        } else {
	        	return "deu erradp";
	        }

	    }

}


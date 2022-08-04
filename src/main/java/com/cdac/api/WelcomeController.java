package com.cdac.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	int count;
        @GetMapping("/message")
	public String getMessage() {
<<<<<<< HEAD
    	int a = 10;
=======
	try{ }
	catch(exception e){}	
>>>>>>> f7118fcc5457b7ce5a04ca4938f31bfd3c4673ab
    	return "welcome...";
    }
}

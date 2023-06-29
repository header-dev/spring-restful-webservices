package com.idevalot.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Hello From Person V1", 33);
	}
	
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVerionOfPerson() {
		return new PersonV2("Hello From Person V2");
	}
	
}

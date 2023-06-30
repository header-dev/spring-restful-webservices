package com.idevalot.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	// Twitter Styles
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Hello From Person V1", 33);
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVerionOfPerson() {
		return new PersonV2("Hello From Person V2");
	}
	
	//	Amazon Styles
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new PersonV1("Hello From Person V1", 44);
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVerionOfPersonRequestParameter() {
		return new PersonV2("Hello From Person V2");
	}
}

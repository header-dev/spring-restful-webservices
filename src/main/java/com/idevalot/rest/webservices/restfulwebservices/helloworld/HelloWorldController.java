package com.idevalot.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/helloworld")
	public String helloWorkd() {
		return "Hello World";
	}

	@GetMapping(path = "/helloworld-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	
	//Path Parameter
	// users/{id}/todos/{id}
	// hello-world/path-variable/{name}
	// hello-world/path-variable/Witz
	@GetMapping(path = "/helloworld/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}

}

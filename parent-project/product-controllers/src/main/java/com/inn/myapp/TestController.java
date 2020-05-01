package com.inn.myapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test/")
public class TestController {

	
	@GetMapping(path="get")
	public List<String> get(){

		return Arrays.asList("Pratik" , "Niyank" );
	}
}

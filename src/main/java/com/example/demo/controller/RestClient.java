package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@Component
public class RestClient implements CommandLineRunner {

	private static void getStudentById() {
		final String uri = "http://localhost:8080/RestTemplate/getData/{id}";

		Map<String, Integer> params = new HashMap<>();
		params.put("id", 5);

		RestTemplate restTemplate = new RestTemplate();
		Student result = restTemplate.getForObject(uri, Student.class, params);

		System.out.println(result);
	}

	@Override
	public void run(String... args) throws Exception {
		getStudentById();

	}

}

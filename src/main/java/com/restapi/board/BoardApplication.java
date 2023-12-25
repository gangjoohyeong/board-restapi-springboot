package com.restapi.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	@RestController
	public static class HelloController {

		@GetMapping("/")
		public Map<String, String> Hello() {
			Map<String, String> map = new HashMap<>();
			map.put("message", "Hello World");
			return map;
		}
	}

}

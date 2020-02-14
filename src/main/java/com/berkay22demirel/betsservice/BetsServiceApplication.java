package com.berkay22demirel.betsservice;

import com.berkay22demirel.betsservice.Model.Match;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class BetsServiceApplication {

	private Map<Integer , Match> mathcsMap = new HashMap<>();

	@PostConstruct
	public void init() {
		mathcsMap.put()
	}

	public static void main(String[] args) {
		SpringApplication.run(BetsServiceApplication.class, args);
	}

}

package com.esprit.microservies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Candidate1Application {

	public static void main(String[] args) {
		SpringApplication.run(Candidate1Application.class, args);
	}

	@Autowired
	private CandidatRepository candidatRepository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			candidatRepository.save(new Candidat("zied","kouki","ziedkouki@esprit.tn"));
			candidatRepository.save(new Candidat("nader","ab","naderab@esprit.tn"));
			candidatRepository.save(new Candidat("amira","ba","amiraba@esprit.tn"));
			candidatRepository.findAll().forEach(System.out::println);
		};
	}
	
	
	
	
}

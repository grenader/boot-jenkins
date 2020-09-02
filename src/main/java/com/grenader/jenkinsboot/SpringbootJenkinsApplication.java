package com.grenader.jenkinsboot;

import com.grenader.jenkinsboot.entity.ThemeParkRide;
import com.grenader.jenkinsboot.repository.ThemeParkRideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

	@Bean
	public CommandLineRunner sampleData(ThemeParkRideRepository repository) {
		return (args) -> {
			repository.save(new ThemeParkRide("Rollercoaster", "Train ride that speeds you along.", 5, 3));
			repository.save(new ThemeParkRide("Log flume", "Boat ride with plenty of splashes.", 3, 2));
			repository.save(new ThemeParkRide("Teacups", "Spinning ride in a giant tea-cup.", 2, 4));
		};
	}
}

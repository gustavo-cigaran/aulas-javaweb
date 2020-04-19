package com.gustavo.SpringBoot.Gradle;

import model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradleApplication.class, args);
		Aluno aluno = new Aluno();

		aluno.setNota1(10);
		aluno.setNota2(8);

		System.out.println(aluno);
	}
}

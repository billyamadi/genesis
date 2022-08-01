package com.laveces.genesis;

import com.laveces.genesis.model.Student;
import com.laveces.genesis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenesisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GenesisApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		Student stud1= new Student();
		stud1.setFirstName("Billy");
		stud1.setSurname("Amadi");
		stud1.setBirthCert("35781928");
		studentRepository.save(stud1);

	}
}

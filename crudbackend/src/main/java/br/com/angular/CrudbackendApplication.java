package br.com.angular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.angular.entities.User;
import br.com.angular.repositories.UserRepository;

@SpringBootApplication
public class CrudbackendApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudbackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.save(new User("José Oswaldo", "Silva"));
		userRepository.save(new User("Heitor José", "Mário"));
		userRepository.save(new User("Kavim Sartoro ", "Silva"));
		
	}
}

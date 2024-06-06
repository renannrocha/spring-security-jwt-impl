package br.com.renannrocha.spring_security_jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);


		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "senha123";

		// Gerar o hash da senha
		String hashedPassword = passwordEncoder.encode(password);
		System.out.println("Senha Hashed = " + hashedPassword);

		// Verificar a senha contra o hash existente
		boolean isPasswordMatch = passwordEncoder.matches(password, hashedPassword);
		System.out.println("Senha corresponde ao hash? " + isPasswordMatch);

	}

}

package io.com.Andre_Felipe_Bomfim.Spring_Architecture;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		SpringApplicationBuilder builder =
				new SpringApplicationBuilder(Application.class); //rodar a aplicação
		builder.bannerMode(Banner.Mode.LOG); //tirar a logo do Spring
		ConfigurableApplicationContext applicationContext = builder.context();

		//var produtoRepository = applicationContext.getBean("produtoRepository");
		//builder.profiles("producao"); //para trabalhar com perfis
		//builder.properties("spring.datasource.url=jdbc://"); //você um dia pode querer usar essa classe para subir uma propriedade na hora de subir a aplicação para Debugar ou algo do tipo

		builder.run(args); //rodar a aplicação
	}

}

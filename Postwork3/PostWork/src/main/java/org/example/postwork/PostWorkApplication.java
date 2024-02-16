package org.example.postwork;

import org.apache.juli.logging.Log;
import org.example.postwork.modelo.Persona;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

import java.util.Scanner;

@SpringBootApplication
public class PostWorkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PostWorkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();

		System.out.println("Introduce el telefono: ");
		String telefono = reader.nextLine();

		Persona persona = new Persona(nombre, telefono);

		System.out.println(persona);
	}
}
//@SpringBootApplication
//public class PostWorkApplication {
////		implements CommandLineRunner{
////			private static Logger LOG = LoggerFactory.getLogger(SpringApplication.class);
////
////			public static void main(String[] args){
////				LOG.info("Starting the application");
////				SpringApplication.run(PostWorkApplication.class,args);
////				LOG.info("Application Finished");
////		}
////
////		@Override
////				public  void run (String ... arg){
////				LOG.info("Executing: command line runner");
////
////				for (int i = 0 ; i < args.length; ++ii){
////					LOG.info("arg[{}]: {}", i,args[i]);
////				}
////		}
////	}
//	public static void main(String[] args) {
//		SpringApplication.run(PostWorkApplication.class, args);
//	}
//
//}

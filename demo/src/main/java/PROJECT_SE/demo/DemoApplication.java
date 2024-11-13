package PROJECT_SE.demo;// Importing necessary Spring Boot and configuration annotations
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Annotation to mark this class as the main entry point for the Spring Boot application
@SpringBootApplication
// @SpringBootApplication is a convenience annotation that combines:
// 1. @Configuration: Marks the class as a source of bean definitions for the application context.
// 2. @EnableAutoConfiguration: Enables Spring Boot's auto-configuration mechanism.
// 3. @ComponentScan: Automatically scans for components (e.g., @Controller, @Service) in the package where the application is located and its sub-packages.

// @EnableJpaRepositories: Enables JPA repositories and specifies the package where repository interfaces are located.
@EnableJpaRepositories(basePackages = "repository") // Specify the package where your GreetingRepository is located

// @EntityScan: Specifies the package(s) to scan for JPA entities.
@EntityScan("entity") // Specify the package where your entities are located

// @ComponentScan: Specifies base packages for scanning Spring components (controllers, services, etc.)
@ComponentScan(basePackages = {"controller", "service", "repository", "entity"}) // Include all packages explicitly

public class DemoApplication {

	// The main method that serves as the entry point for the Spring Boot application.
	public static void main(String[] args) {
		// Launches the application by invoking SpringApplication.run, which sets up the application context and starts the Spring Boot application.
		SpringApplication.run(DemoApplication.class, args);
	}
}

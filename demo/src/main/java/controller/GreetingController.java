package controller;// Importing necessary classes and packages
// DTO (Data Transfer Object) used for transferring data between processes
import DTO.GreetingDTO;

// Importing the Greeting entity which represents the data model
import entity.Greeting;

// Importing Spring's annotations for defining REST APIs
import org.springframework.web.bind.annotation.*;

// Importing the service layer which contains the business logic
import service.GreetingService;

import java.util.List;

// Annotation indicating that this class is a REST controller and will handle HTTP requests
@RestController

// Annotation to map HTTP requests to specific URL paths. This controller listens to "api/greeting" paths.
@RequestMapping("api/greeting")
public class GreetingController {

    // Dependency on GreetingService to handle business logic related to greetings
    GreetingService greetingService;

    // Constructor-based dependency injection to initialize the GreetingService
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Handles HTTP GET requests to retrieve a list of greetings
    // @GetMapping maps this method to a GET request on the "api/greeting" endpoint
    @GetMapping
    public List<Greeting> getGreeting() {
        // Calls the service layer to get a list of all greetings and returns it
        return greetingService.getGreeting();
    }

    // Handles HTTP POST requests to add a new greeting
    // @PostMapping maps this method to a POST request on the "api/greeting" endpoint
    // @RequestBody binds the HTTP request body to a GreetingDTO object
    @PostMapping
    public void addGreeting(@RequestBody GreetingDTO greetingDTO) {
        // Calls the service layer to add a new greeting with the data provided in the request body
        greetingService.addGreeting(greetingDTO);
    }
}

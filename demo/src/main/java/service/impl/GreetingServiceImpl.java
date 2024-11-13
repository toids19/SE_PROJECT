package service.impl;// Importing the GreetingDTO class used for data transfer
import DTO.GreetingDTO;

// Importing the Greeting entity class which represents the data model
import entity.Greeting;

// Importing the Spring framework's @Service annotation to indicate that this class is a service component
import org.springframework.stereotype.Service;

// Importing the GreetingRepository for database interaction
import repository.GreetingRepository;

// Importing the GreetingService interface that this class implements
import service.GreetingService;

import java.util.List; // Importing List for returning a collection of greetings

// Annotation to mark this class as a service component in the Spring context
@Service
public class GreetingServiceImpl implements GreetingService {

    // Declaring a final instance of GreetingRepository for dependency injection
    private final GreetingRepository greetingRepository;

    // Constructor-based dependency injection for GreetingRepository
    public GreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Implementation of the getGreeting method from the GreetingService interface
    @Override
    public List<Greeting> getGreeting() {
        // Calls the repository to fetch all Greeting records from the database
        return greetingRepository.findAll();
    }

    // Implementation of the addGreeting method from the GreetingService interface
    @Override
    public void addGreeting(GreetingDTO greetingDTO) {
        // Creating a new Greeting entity and setting its properties from the DTO
        Greeting greeting = new Greeting();
        greeting.setText(greetingDTO.getText());

        // Saving the new Greeting entity to the database
        greetingRepository.save(greeting);
    }
}

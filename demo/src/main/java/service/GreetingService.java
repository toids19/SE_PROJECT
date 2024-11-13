package service;// Importing the GreetingDTO class for transferring data between layers
import DTO.GreetingDTO;

// Importing the Greeting entity class which represents the data model
import entity.Greeting;

import java.util.List; // Importing List for returning collections of greetings

// Defining an interface for the service layer that outlines the contract for Greeting-related operations
public interface GreetingService {

    // Method to retrieve a list of all Greeting entities from the database
    List<Greeting> getGreeting();

    // Method to add a new Greeting entity using data provided in a GreetingDTO
    void addGreeting(GreetingDTO greetingDTO);
}

package DTO;// Importing Lombok annotations to reduce boilerplate code for getters, setters, constructors, etc.
import lombok.AllArgsConstructor; // Generates a constructor with all fields as parameters
import lombok.Getter; // Generates getter methods for all fields
import lombok.NoArgsConstructor; // Generates a no-argument constructor
import lombok.Setter; // Generates setter methods for all fields

// Lombok annotations used to automatically generate common methods and constructors:
// @Getter and @Setter: Automatically generate getter and setter methods for the fields in this class.
@Getter
@Setter

// @AllArgsConstructor: Generates a constructor that accepts parameters for all fields.
@AllArgsConstructor

// @NoArgsConstructor: Generates a no-argument constructor for the class.
@NoArgsConstructor
public class GreetingDTO {

    // A private field representing the text content of the greeting
    private String text;
}

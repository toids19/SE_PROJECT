package repository;// Importing the Greeting entity class for use in the repository
import entity.Greeting;

// Importing Spring Data PA's JpaRepository interface, which provides CRUD operations and more
import org.springframework.data.jpa.repository.JpaRepository;

// Defining an interface that extends JpaRepository to handle data access for the Greeting entity
// This interface will automatically inherit basic CRUD operations and JPA functionality
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    // JpaRepository<Greeting, Long>:
    // - Greeting: The type of the entity to be managed by this repository.
    // - Long: The type of the entity's primary key (gId in the Greeting entity).
}

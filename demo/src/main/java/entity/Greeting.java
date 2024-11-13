package entity;// Importing Jakarta Persistence (JPA) annotations for ORM (Object-Relational Mapping)
import jakarta.persistence.*;

// Importing Lombok annotations to automatically generate getters, setters, and a no-argument constructor
import lombok.Getter; // Generates getter methods for all fields
import lombok.NoArgsConstructor; // Generates a no-argument constructor
import lombok.Setter; // Generates setter methods for all fields

// Lombok annotations used for convenience and to reduce boilerplate code:
// @Setter and @Getter: Automatically generate getter and setter methods for the fields in this class.
@Setter
@Getter

// @NoArgsConstructor: Generates a no-argument constructor.
@NoArgsConstructor

// @Entity: Marks this class as a JPA entity, making it mapped to a database table.
@Entity

// @Table: Specifies the name of the database table this entity will map to.
@Table(name = "Greeting")  // Ensure this matches your database table name
public class Greeting {

    // @Id: Marks this field as the primary key of the entity.
    // @GeneratedValue: Specifies how the primary key should be generated. The strategy `GenerationType.IDENTITY` indicates that the primary key is auto-incremented by the database.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gId;  // Primary key field, typically used to uniquely identify each record

    // A simple field to hold the text of the greeting.
    private String text;

    // Constructor for creating instances of Greeting with initial values.
    public Greeting(long gId, String text) {
        this.gId = gId;
        this.text = text;
    }
}

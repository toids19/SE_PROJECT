package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "Greeting")  // Ensure this matches your database table name
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gId;

    private String text;

    // Constructor for convenience
    public Greeting(long gId, String text) {
        this.gId = gId;
        this.text = text;
    }
}

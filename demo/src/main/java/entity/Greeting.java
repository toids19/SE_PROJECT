package entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="Greeting")  // Make sure this name matches your table name
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "gId")
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gId;
    private String text;

    public Greeting(long gId, String text) {
        this.gId = gId;
        this.text = text;
    }
}

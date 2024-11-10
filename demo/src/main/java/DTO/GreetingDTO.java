package DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GreetingDTO {


    private String text;

    public GreetingDTO(String text) {
        this.text = text;
    }

}

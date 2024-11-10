package controller;

import DTO.GreetingDTO;
import entity.Greeting;
import org.springframework.web.bind.annotation.*;
import service.GreetingService;

import java.util.List;

@RestController
@RequestMapping("api/greeting")
public class GreetingController {


    GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public List<Greeting> getGreeting(){
        return greetingService.getGreeting();
    }

    @PostMapping
    public void addGreeting(@RequestBody GreetingDTO greetingDTO){
    greetingService.addGreeting(greetingDTO);
    }
}

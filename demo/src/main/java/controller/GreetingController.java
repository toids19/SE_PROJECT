package controller;

import DTO.GreetingDTO;
import entity.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import service.GreetingService;

import java.util.List;

@Controller
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

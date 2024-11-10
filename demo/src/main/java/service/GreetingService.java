package service;

import DTO.GreetingDTO;
import entity.Greeting;

import java.util.List;

public interface GreetingService {
    List<Greeting> getGreeting();
    void addGreeting(GreetingDTO greetingDTO);
}

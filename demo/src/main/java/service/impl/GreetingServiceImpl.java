package service.impl;

import DTO.GreetingDTO;
import entity.Greeting;
import org.springframework.stereotype.Service;
import repository.GreetingRepository;
import service.GreetingService;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public List<Greeting> getGreeting() {
        return greetingRepository.findAll();
    }

    @Override
    public void addGreeting(GreetingDTO greetingDTO) {
        Greeting greeting = new Greeting();
        greeting.setText(greetingDTO.getText());
        greetingRepository.save(greeting);  // Save to the database
    }
}

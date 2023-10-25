package Services;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;



@Service
public class GreetingsServiceConstructor implements GreetingsService {


    @Override
    public String greeting() {
        return "greetings from constructor";
    }
}

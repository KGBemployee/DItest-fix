package Controller;

import Services.GreetingsService;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorController {

    private final GreetingsService greetingsService;

    public ConstructorController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String greeting(){
       return greetingsService.greeting();
    }

}

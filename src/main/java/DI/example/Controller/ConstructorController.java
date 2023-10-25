package DI.example.Controller;

import DI.example.Services.GreetingsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConstructorController {

    private final GreetingsService greetingsService;

    public ConstructorController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping("/greeting")
    public String greeting(){
       return greetingsService.greeting();
    }

}

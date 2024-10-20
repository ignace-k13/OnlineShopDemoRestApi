package ing.officetools.demostore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") //check root path defined in properties: server.servlet.context-path
public class DefaultController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the demo store";
    }
}

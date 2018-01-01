package springBootSample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/index")
    String index() {
        return "Spring Boot Test";
    }
}
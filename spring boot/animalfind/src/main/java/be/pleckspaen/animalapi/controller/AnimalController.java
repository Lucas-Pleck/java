package be.pleckspaen.animalapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${spring.data.rest.base-path}/animal")
public class AnimalController {


    @GetMapping()
    public String HelloWorld() {
        return "Hello World";
    }
}

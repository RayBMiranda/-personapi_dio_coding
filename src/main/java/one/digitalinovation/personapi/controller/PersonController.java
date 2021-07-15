package one.digitalinovation.personapi.controller;

import one.digitalinovation.personapi.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping
    public String getBooks(){
        Person person = new Person();
        person.getId();
        return "API Teste!";
    }
}

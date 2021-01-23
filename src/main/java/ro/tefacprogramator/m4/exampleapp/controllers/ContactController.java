package ro.tefacprogramator.m4.exampleapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/")
    public String homepage() {
        return "Welcome !";
    }

}

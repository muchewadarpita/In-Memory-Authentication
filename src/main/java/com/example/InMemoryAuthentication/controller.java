package com.example.InMemoryAuthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/delete") public String delete()
    {
        return "This is the delete request";
    }
    @GetMapping("/details") public String get()
    {
        return "This is the details request";
    }
}

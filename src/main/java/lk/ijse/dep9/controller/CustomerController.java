package lk.ijse.dep9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")   // supplying handler mapping
public class CustomerController {

    @GetMapping
    public String doSomething(){
        System.out.println("Came here...");
        return "customers";
    }
}

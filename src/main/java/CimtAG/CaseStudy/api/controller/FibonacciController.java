package CimtAG.CaseStudy.api.controller;

import CimtAG.CaseStudy.api.model.Fibonacci;
import CimtAG.CaseStudy.api.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    @GetMapping("/fib")
    public Fibonacci getFibonacci2(@RequestParam Integer input){
        Fibonacci fibonacci = new Fibonacci(input);
        return fibonacci;
    }
}

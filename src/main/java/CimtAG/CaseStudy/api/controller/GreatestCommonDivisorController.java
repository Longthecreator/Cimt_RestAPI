package CimtAG.CaseStudy.api.controller;

import CimtAG.CaseStudy.api.model.GreatestCommonDivisor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatestCommonDivisorController {

    @PostMapping("/calc")
    @ResponseBody
    public GreatestCommonDivisor getGreatestDivisor(@RequestBody GreatestCommonDivisor gcd){
        gcd.calculateGcd();
        return gcd;
    }
}

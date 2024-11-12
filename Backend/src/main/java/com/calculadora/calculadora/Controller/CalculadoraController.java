package com.calculadora.calculadora.Controller;

import com.calculadora.calculadora.Service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/sumar")
    public double sumar(@RequestParam double sum1, @RequestParam double sum2) {
        return calculadoraService.sumar(sum1, sum2);
    }

    @PostMapping("/restar")
    public double restar(@RequestParam double sum1, @RequestParam double sum2) {
        return calculadoraService.restar(sum1, sum2);
    }

    @PostMapping("/multiplicar")
    public double multiplicar(@RequestParam double sum1, @RequestParam double sum2) {
        return calculadoraService.multiplicar(sum1, sum2);
    }

    @PostMapping("/dividir")
    public double dividir(@RequestParam double sum1, @RequestParam double sum2) {
        return calculadoraService.dividir(sum1, sum2);
    }
}

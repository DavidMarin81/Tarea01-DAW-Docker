package com.calculadora.calculadora.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double sumar(double sum1, double sum2) {
        return sum1 + sum2;
    }

    public double restar(double sum1, double sum2) {
        return Math.round((sum1 - sum2) * 100.0) / 100.0;
    }

    public double multiplicar(double sum1, double sum2) {
        return Math.round((sum1 * sum2) * 100.0) / 100.0;
    }

    public double dividir(double sum1, double sum2) {
        if(sum2 == 0) {
            return 0;
        }
        if (sum1 < sum2) {
            return Math.round((sum2 / sum1) * 100.0) / 100.0;
        } else {
            return Math.round((sum1 / sum2) * 100.0) / 100.0;
        }
    }
}

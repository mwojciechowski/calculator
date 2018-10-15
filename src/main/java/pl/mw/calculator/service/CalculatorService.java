package pl.mw.calculator.service;

import org.mariuszgromada.math.mxparser.Expression;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double calculateExpression(String expression) {
        return new Expression(expression).calculate();
    }

    public double calculateIntegralExp(double low, double high) {
        return Math.exp(high) - Math.exp(low);
    }
}

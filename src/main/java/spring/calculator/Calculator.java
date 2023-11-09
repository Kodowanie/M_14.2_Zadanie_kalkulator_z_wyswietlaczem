package spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {
    @Autowired
    private Display display;

    public void add(double a, double b){
        double sum = a + b;
        System.out.println("calculate = a + b");
        System.out.println("a = " + display.displayValue(a));
        System.out.println("b = " +  display.displayValue(b));
        System.out.println("sum = " + display.displayValue(sum));
    }

    public void sub(double a, double b){
        double sum = a - b;
        System.out.println("calculate = a - b");
        System.out.println("a = " + display.displayValue(a));
        System.out.println("b = " +  display.displayValue(b));
        System.out.println("sum = " + display.displayValue(sum));
    }

    public void mul(double a, double b){
        double sum = a * b;
        System.out.println("calculate = a * b");
        System.out.println("a = " + display.displayValue(a));
        System.out.println("b = " +  display.displayValue(b));
        System.out.println("sum = " + display.displayValue(sum));
    }

    public void div(double a, double b){
        double sum = a / b;
        System.out.println("calculate = a / b");
        System.out.println("a = " + display.displayValue(a));
        System.out.println("b = " +  display.displayValue(b));
        System.out.println("sum = " + display.displayValue(sum));
    }

}

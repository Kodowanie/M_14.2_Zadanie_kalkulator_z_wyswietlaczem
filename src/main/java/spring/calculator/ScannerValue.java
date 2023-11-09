package spring.calculator;



import java.util.Scanner;

public class ScannerValue implements IScannerValue{
    @Override
    public double valueScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}

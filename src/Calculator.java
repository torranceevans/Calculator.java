/*
In this project, you will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:
Add, subtract, multiply, divide, and apply the modulo operator on 2 integers.
*/
public class Calculator{
    public Calculator() {
    }
    //calculator
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }
}


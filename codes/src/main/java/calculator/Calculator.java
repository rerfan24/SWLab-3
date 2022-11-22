package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public int squareRoot(int a) {
        if (a < 0) {
            return (-1);
        }
        return (int)Math.sqrt(a);
    }
}

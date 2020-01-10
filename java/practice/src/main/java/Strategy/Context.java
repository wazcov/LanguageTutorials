package Strategy;

public class Context {
    public static void main(String[] args) {
        doStuff(new AddCalculate(), 10, 5);
        doStuff(new MinusCalculate(), 10, 5);
    }

    public static void doStuff(ICalculate calculateStrategy, int a, int b) {
        System.out.println(calculateStrategy.calculate(a, b));
    }
}

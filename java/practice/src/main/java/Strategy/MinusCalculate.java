package Strategy;

public class MinusCalculate implements ICalculate{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}

package Strategy;

public class AddCalculate implements ICalculate{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}

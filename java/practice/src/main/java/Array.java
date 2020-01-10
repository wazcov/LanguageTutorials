import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] nums = {1, 3.6, 4.1, 5.5};
        double total = 0.0;
        double added = Arrays.stream(nums).sum();
        double newAdded = 0;
        for(double x : nums) {
            newAdded += x;
        }
        total = newAdded / nums.length;
        System.out.println(total);
    }
}

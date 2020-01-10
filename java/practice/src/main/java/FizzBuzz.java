public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            String s = "";
            if (i % 3 == 0) {
                s += "fizz";
            }
            if (i % 5 == 0) {
                s += "buzz";
            }
            //System.out.println(i + " " + s);
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println(i + (i % 3 == 0 ? "fizz" : "") + (i % 5 == 0 ? "buzz" : ""));
        }
    }
}
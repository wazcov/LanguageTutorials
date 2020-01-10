import java.util.HashMap;

public class Codewars {
    public static void main(String[] args) {
        HashMap<String, Integer> blahMap = new HashMap<>();
        blahMap.put("Test", 1);
        blahMap.put("Random", 2);
        blahMap.put("Test", 3);

        blahMap.entrySet().stream().map(e-> e.getKey()).distinct().forEach(e -> System.out.println(e));
    }
}

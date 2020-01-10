import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {

        //Create A List
        List<String> myList = new ArrayList<>();

        //Add Entries To It
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Mango");
        myList.add("Apple");

        //Simple For Loop Iterating List
        for(String fruit: myList) {
            System.out.println(fruit);
        }

        //Simple Iterator Iterating List
        Iterator fruitIterator = myList.iterator();
        while(fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }

        //List To Map Easier Way
        HashMap<String, Long> easyFruitMap = new HashMap<>();
        for(String fruit: myList) {
            if(easyFruitMap.containsKey(fruit)) {
                easyFruitMap.put(fruit, easyFruitMap.get(fruit) + 1);
            } else {
                easyFruitMap.put(fruit, 1l);
            }
        }

        //Convert List to HashMap
        HashMap<String, Long> fruitMap = (HashMap) myList.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        //For Loop Iterating Map
        for(Map.Entry<String, Long> entry: fruitMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //Stream Iterating Map
        fruitMap.entrySet().stream().forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey() + ":" + stringLongEntry.getValue()));

        //Iterator Iterating Map
        Iterator fruitIterator2 = easyFruitMap.entrySet().iterator();
        while(fruitIterator2.hasNext()) {
            System.out.println(fruitIterator2.next());
        }
    }
}

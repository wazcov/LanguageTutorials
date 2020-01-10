import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");

        //System.out.println(myQueue.peek());

        Iterator iterator = myQueue.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        myQueue.add("Four");


    }
}

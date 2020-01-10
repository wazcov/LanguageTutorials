package main.java;

import java.util.List;
import java.util.logging.Logger;

public class Test {
    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        logger.info("test");

        var testList = List.of(new Person("Fred"), new Person("Sam"), new Person("Fred"));

        var numOfUniqueNames = testList.stream().map(Person::getName).distinct().count();
        System.out.println(numOfUniqueNames);

    }

}

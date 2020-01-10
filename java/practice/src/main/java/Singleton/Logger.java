package Singleton;

public class Logger {
    private static Logger instance = null;

    private Logger() {
    }

    public static synchronized Logger getLogger() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

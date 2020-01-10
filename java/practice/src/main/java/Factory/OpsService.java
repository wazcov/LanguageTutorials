package Factory;

public class OpsService implements IService {

    private static OpsService instance = null;

    private OpsService() {
    }

    public static synchronized OpsService getService() {
        if(instance == null) {
            instance = new OpsService();
        }
        return instance;
    }

    @Override
    public int returnANumber() {
        return 5;
    }
}

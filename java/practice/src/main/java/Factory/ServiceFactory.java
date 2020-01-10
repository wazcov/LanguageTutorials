package Factory;

public class ServiceFactory {

    private ServiceFactory() {}

    public static IService getService(ServiceTypes serviceTypes) {
        switch(serviceTypes) {
            case DEV:
                return OpsService.getService();
            case OPS:
                return new DevService();
            default:
                return new DevService();
        }
    }
}

enum ServiceTypes {
    OPS(1), DEV(2);

    private int connectionNumber;

    ServiceTypes(int connectionNumber) {
        this.connectionNumber = connectionNumber;
    }

    public int getConnectionNumber() {
        return connectionNumber;
    }
}

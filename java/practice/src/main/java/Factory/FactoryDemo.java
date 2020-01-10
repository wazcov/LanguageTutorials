package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        IService service = ServiceFactory.getService(ServiceTypes.DEV);
        System.out.println(service.returnANumber());
    }
}

package Factory;

public class DevService implements IService {

    public DevService() {
    }

    @Override
    public int returnANumber() {
        return 6;
    }
}

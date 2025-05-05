public class ServiceStation {

    public void check(Serviceable serviceable) {
        if (serviceable != null) {
            serviceable.service();
        } else {
            System.out.println("Транспортное средство не найдено");
        }
    }
}

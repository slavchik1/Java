public class Colleague extends Contact {
    public Colleague(String name, String phone_number) {
        super(name, phone_number);
    }

    @Override
    public String getType() {
        return "Colleague";
    }
}

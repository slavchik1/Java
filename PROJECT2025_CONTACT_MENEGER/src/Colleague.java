public class Colleague extends Contact {
    public Colleague(String name, int phone_number) {
        super(name, phone_number);
    }

    @Override
    public String getType() {
        return "Colleague";
    }
}

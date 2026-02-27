public class Relative extends Contact {
    public Relative(String name, String phone_number) {
        super(name, phone_number);
    }

    @Override
    public String getType() {
        return "Relative";
    }
}

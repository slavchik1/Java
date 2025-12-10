public class Friend extends Contact {
    public Friend(String name, int phone_number) {
        super(name, phone_number);
    }

    @Override
    public String getType() {
        return "Friend";
    }
}

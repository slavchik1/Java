public class Friend extends Contact {
    public Friend(String name, String phone_number) {
        super(name, phone_number);
    }

    @Override
    public String getType() {
        return "Friend";
    }
}

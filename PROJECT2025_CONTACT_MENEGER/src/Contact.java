public abstract class Contact {
    public String phone_number;
    public String name;


    public Contact(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }


    public void change_phone_number(String new_phone_number) {
        this.phone_number = new_phone_number;
    }


    public void change_name(String new_name) {
        this.name = new_name;
    }


    public void print_info() {
        System.out.printf("Імʼя: %s\nНомер телефону: %s\nТип: %s\n\n", this.name, this.phone_number, getType());
    }


    abstract String getType();
}

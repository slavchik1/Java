public abstract class Contact {
    public int phone_number;
    public String name;


    public Contact(String name, int phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }


    public void change_phone_number(int new_phone_number) {
        this.phone_number = new_phone_number;
    }


    public void change_name(String new_name) {
        this.name = new_name;
    }
}

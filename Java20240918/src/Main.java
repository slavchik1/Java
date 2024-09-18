public class Main {
    public static void main(String[] args) {
        Animal my_animal = new Animal();
        Dog my_dog = new Dog();
        Cat my_cat = new Cat();
        Chicken my_chiken = new Chicken();
        my_animal.name = "Murchyk";
        my_dog.name = "Pushok";
        my_animal.makeSound();
        my_dog.makeSound();
        my_cat.makeSound();
        my_chiken.makeSound();
    }
}
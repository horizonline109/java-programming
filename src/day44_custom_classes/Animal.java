package day44_custom_classes;

public class Animal {
    String type = "Cheetah";

    public void eat() {
        System.out.println(type + ": Eats other animals.");

    }

    public void eat(String food) {
        System.out.println("Eating " + food);
    }

    public void speak() {
        System.out.println(type + ": Has 8 distinctive vocalizations including a purr and growl.");
    }


}

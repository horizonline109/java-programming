package day43_list_custom_classes;

public class Person {
    String firstName;
    int age;
    char gender;
    //any object we assign to person can have these two values.

    public void speak() {
        System.out.println("Person is speaking.");
    }
}

class People{
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);
    }

}

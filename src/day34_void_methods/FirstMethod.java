package day34_void_methods;

public class FirstMethod {

    static void findSaim(){
        boolean saimHere = true;
        if(saimHere){
            System.out.println("Thank you! Now you can help Murodil set up computer");
        } else {
            System.out.println("Uh no! Time for extra long break!");
        }
    }
    public static void displayMessage(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello B22 Friends!");
        }

    }

    public static void main(String[] args) {
        System.out.println("Is Saim here?");
            findSaim();
        System.out.println();
        displayMessage();
    }
}

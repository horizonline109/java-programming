package day18_conditions_practice_strings_intro;

public class SwitchCheckNumbers {
    public static void main(String[] args) {
        int num1 = 20; //num1 =20
        int num2 = 10; //num2 = 10

        switch(num1) { // similar to an if statement
            case 10:
                num1++; //num1 =11
                num2+=10; //num2 = 20
                break;
            case 20:
                num1+=num2;
                num2--; // notice that there's no break; in this case
            case 30:
                num1 = 0;
                num2 -= 3;
                break;
        }
    }
}

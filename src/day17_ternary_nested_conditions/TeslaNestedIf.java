package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "Long range";
        //String range
        if(model == 'S') {
            if(trim.equals("long range")) {
                System.out.println("Cheap one");
            }
        }
        
        boolean X = true;
        System.out.println("X = " + X);
        boolean Y = !X == false;
        System.out.println("Y = " + Y);
        boolean Z = Y;
        System.out.println("Z = " + Z);

        int num = 10;
        if (--num > 10) {
            System.out.println("Hello Cyber " + num);
        } else {
            System.out.println("Hello World " + num);
        }

        boolean A = true, B = !false;
        if(B) {
            System.out.println("B");
        } else if (A) {
            System.out.println("A");
        }else{
            System.out.println("C");
        }

        char grade = 'A';
        boolean passed = grade == 'A' || grade == 'B';

        int x = 10;
        int y = x++;
        System.out.println(y++ + "" + x++ + "" + y);
    }
}

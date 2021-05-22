package day11_camparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println("10 == 10"); //true
        System.out.println("1000 > 100"); //true
        System.out.println("985.44 < 98547.8"); //true
        System.out.println("10 <= 11"); //true
        System.out.println("5 >= 3");//true
        System.out.println("-100 != 44"); // true, -100 IS NOT EQUAL

        int a = 100;
        int b = 200;
        System.out.println(a == b); //false
        System.out.println(a > b);  //false
        System.out.println(a < b);  //true
        System.out.println(a >= b); //false
        System.out.println(a <= b); //true
        System.out.println(a != b); //true

        boolean result= 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44; //comparison opperator will create a true or false response
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle"); //true
        System.out.println(city == "Baku"); //false

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);
        
        checkName = name != "Nadir";
        System.out.println("checkName = " + checkName);

        int n1 = 5;
        int n2 = 3;

        System.out.println(n1 == n2);
        boolean check = n1 == n2; //need a boolean to compare the two pieces of data
        System.out.println(check);

        boolean check2 = n1 > n2;
        System.out.println(check2);

        boolean hungry = n1 != n2;
        System.out.println(hungry);

        int age = 2;
        boolean toddler = age > 3;
        System.out.println(toddler);

        age = 66;
        boolean seniorCitizen = age >= 65;
        System.out.println("Is senior citizen? - " + seniorCitizen);


    }
}

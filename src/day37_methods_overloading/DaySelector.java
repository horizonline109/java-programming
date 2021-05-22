package day37_methods_overloading;

public class DaySelector {
    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("null");
                return "Invalid input";
        }

        //public static void myMethod () {
        //code
        //}
/*
        public static String myMethod (word){
        }

        public static boolean myMethod ( boolean b, double num){

        }

        public static void myMethod (double num,  boolean b){
        }

    }
} */
    }
}
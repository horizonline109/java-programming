package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        System.out.println("----- Prices More Than 100 -----");
        for (double eachPrice : prices) {
            if (eachPrice > 100) {
                System.out.print(eachPrice + ", ");
            }
        }
        System.out.println("\n---- prices between 10 and 70----");
        for (double eachPrice : prices) {
            if (eachPrice >= 10 || eachPrice <= 70) {
                System.out.print(eachPrice + ", ");
            }
        }
        System.out.println("\n Count of the prices more than 50");
        int count = 0;
        for (double eachPrice : prices) {
            if (eachPrice > 50) {
                count++;
            }
        }
        System.out.print(count + " ");

        System.out.println("\n----Countries with Name Length More Than Seven----");
        for(String each : countries){
            if(each.length() >=7){
                System.out.print(each + ", ");
            }
        }
    }
}

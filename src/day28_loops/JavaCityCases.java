package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for (int cases = 1; cases <= 30; cases++){
            //totalCases += 200;
            System.out.println("Day " + cases + " | total cases: " + totalCases);
            if (cases % 7 ==0){totalCases+=500;}
            else {totalCases +=200;} }
        System.out.println(totalCases);
    }
}

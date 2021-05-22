package day29_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int outer = 0; outer < word.length(); outer++) {
            char outerChar = word.charAt(outer);
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {
                char innerChar = word.charAt(inner);
                if (outerChar == innerChar) {
                    count++;
                }
            }
            System.out.println(outerChar + " = " + count);

        }


        int count =10;
        double price = 4.55;
        String day = "Saturday";
        String student = "Mary";
        String student2 = "Ramin";
        String city = "Vienna";
        String city2 = "Boston";


    }
}

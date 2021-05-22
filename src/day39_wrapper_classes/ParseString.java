package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {


        String strPrice = "123.5";
        double dbPrice = (Double.parseDouble(strPrice));
        if(dbPrice > 100) {
            System.out.println("Expensive");
        }

        String sentence = "I wrote 100 lines of code.";
        String [] arr = (sentence.split(" "));
        int linesOfCode = Integer.parseInt(arr[2]);
        System.out.println(linesOfCode);


        String total = "6789";
        int num = (Integer.parseInt(total));
        System.out.println("Integer = " + num);
    }
}

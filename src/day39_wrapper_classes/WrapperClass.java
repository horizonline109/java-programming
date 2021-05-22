package day39_wrapper_classes;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " +num);
        num+=10;
        System.out.println(num);

        Integer n = new Integer(500);
        System.out.println("is n 500? = " + n.equals(500));
        System.out.println(+300);

        Integer n2 =1000;
        System.out.println(n2/2);
        String numStr = n2 + "";
        String numSt = n2.toString();
        System.out.println("numStr = " + numStr);
        System.out.println("numSt = " + numSt);
    }

}

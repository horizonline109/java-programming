package day38_methods;



public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        printNum(100);
    }
    public static void start(){
        System.out.println("start");
        continues();
    }
    public static void continues(){
        System.out.println("continue");
        end();
    }
    public static void  end(){
        System.out.println("end");
    }

    public static void printNum(int num) {
        System.out.print(num + ",");
        num++;
        if (num <= 100) {
            printNum(num);
        }
    }


}

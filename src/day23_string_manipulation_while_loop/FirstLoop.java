package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){ //similar to an if statement, but will continue to run the code over abd over again until stopped
            System.out.println("java is fun");
            i++;
        }

        int apples = 0;
        while(apples<=100){
            System.out.println("apple -> " + apples);
            apples += 3;
        }

    }
}

package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("Cars in parking lot = " + cars);
        cars = cars + 2;
        // shorthand versioncars += 2;
        System.out.println("Cars in parking lot = " + cars);
        cars += 5;
        System.out.println("Cars in parking lot = " + cars);
        // 6 cars leave the parking lot
        cars -= 6;
        System.out.println("Cars in parking lot = " + cars);
        cars = cars - 1;
        cars -= 1;
        System.out.println("Cars in parking lot= " + cars);
        //13 electric cars
        int electricCars = 13;
        cars += electricCars;
        System.out.println("Cars in parking lot= " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word = word + "programming";
        System.out.println("word = " + word);
        // ad " is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun.";
        word += selenium;
        System.out.println("word = " + word);
        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 6;
        //letter = 'J';
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.5;
        System.out.println("Normal parking fee = " + parkingFee);
        //earlybird fee is 50 off
        parkingFee /= 2;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee *= 0;
        //parkingFee -= parkingFee; either will work!
        System.out.println("parkingFee = " + parkingFee);
        
        int i = 44;
        i --;
        System.out.println("i = " + i);



    }
}

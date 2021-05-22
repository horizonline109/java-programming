package day41_arraylist;


import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
       ArrayList<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Tesla");
        myCars.add("Ford");
        myCars.add("Hyundai");
        myCars.add("Honda");
        myCars.add(0, "Jeep");
        myCars.add(1,"Lada");
        myCars.add(2, "Yugo");

        System.out.println(myCars.toString());
        String allCarsIn1st = myCars.toString();
        System.out.println("allCarsIn1st = " + allCarsIn1st);


        //change index 0 to Lambourghini

        myCars.set(0, "Lambourghini");
        System.out.println(myCars);
        
        myCars.add(0, "Lambourghini");
        System.out.println("allCarsIn1st = " + myCars);
        
        myCars.set(0, "Honda");
        System.out.println("allCarsIn1st = " + myCars);

        myCars.set(myCars.indexOf("Ford"), "BMW");
        System.out.println("allCarsIn1st = " + myCars);
        System.out.println("index of Ford = " + myCars.indexOf("Ford"));

        if(myCars.contains("Lada")){
            myCars.set(myCars.indexOf("Lada"), "Bugatti");
        } else {
            System.out.println("Lada is not found");
        }

        System.out.println("After set Bugatti = " + myCars.toString());



        for(int i = 0; i < myCars.size(); i++) {
            if(myCars.get(i).equalsIgnoreCase("Lambourghini")) {
                myCars.set(i , "Prius");
            }
            System.out.println(myCars);
        }
    }
}

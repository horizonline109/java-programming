package solo_practice;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;

public class ReplitRepeatAll {

        //create your method below
       public static ArrayList <Boolean> repeatAll(ArrayList<Boolean> list) {
            ArrayList <Boolean> copiedList = new ArrayList<>(list);
            for(boolean each : list) {
                copiedList.add(each);
            }
            return copiedList;
        }






        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Boolean> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.nextBoolean());
            }

            System.out.println(repeatAll(list));

        }

    }


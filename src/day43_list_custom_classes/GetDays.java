package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetDays {
    public static void main(String[] args) {
        System.out.println(dayNames());
        dayNames().size();
        System.out.println("getDays().size = " + dayNames().size());

        System.out.println("removed = "+ dayNames());
    }

    List<Integer> nums = new ArrayList<>();





    public static List<String> dayNames() {
            List<String> days = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");


            return days;

    }
}

package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        //winter 12, 1, 2
        // spring  3, 4, 5
        //summer 6, 7, 8
        //fall 9, 10, 11
        //other way of doing it
       //if (month == 12 || month == 1 || month == 2) {
        //System.out.println("winter");
        //}
        int month = 4;
        switch(month) {
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Please enter a valid month: 1-12");
        }
    }
}


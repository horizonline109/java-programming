package solo_practice;
import java.util.*;

public class ReplitParty {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String guestList = "";
        String rsvp = "";

        System.out.println("Please enter guest name:");
        String newGuest = input.next();
        guestList += newGuest + ", ";

        while (!rsvp.equals("no")) {
            System.out.println("Do you want to enter new guest name:");
            rsvp = input.next();

            if (rsvp.equals("yes")) {
                System.out.println("Please enter guest name:");
                newGuest = input.next();
                guestList += newGuest + ", ";
            }

        }
        System.out.println("Guest's list: " + guestList);
    }
}

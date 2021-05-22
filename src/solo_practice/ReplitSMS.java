package solo_practice;
import java.util.*;

public class ReplitSMS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    String message = scan.nextLine();
    String sender;
    String phoneNumber;
    String messageBody;


        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("Sender: " + mobile);

        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println("Phone Number: " + message.substring(start +1 , end));

        messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("Message body: " + messageBody);
    }
}

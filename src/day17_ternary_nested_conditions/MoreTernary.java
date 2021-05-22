package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = "accept";
        System.out.println((hourlyRate > 45) ? "accept" : "reject");

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Murodil and Saim" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "Yes, have DL. Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);


    }
}

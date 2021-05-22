package day15_logicalops_switch_ternary;

public class JobInterview {
    public static void main(String[] args) {
        String location = "San Francisco";
        double salary = 125000;
        boolean isRemote = true;
        boolean hasBenefits = true;
        if (location.equals("San Francisco") && salary >= 125000 && isRemote && hasBenefits) {
            System.out.println("Accept job offer");
        } else {
            System.out.println("Thank you so much, I will continue searching.");
        }


    }
}

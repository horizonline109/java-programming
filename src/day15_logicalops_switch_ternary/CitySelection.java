package day15_logicalops_switch_ternary;

public class CitySelection {
    public static void main(String[] args) {
        String city = "San Diego";
        if (city.equals("San Diego") || city.equals("Buenos Aires")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher =  "Saim";
        if(teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("You will have your Java class with your instructor " + teacher);
        } else if (teacher.equals ("Nadir")) {
            System.out.println("Today your Soft Skills class is " + teacher);
        } else {
            System.out.println("You will have a substitute instructor for today.");
        }

        String company = "Nasa";
        double salary = 100000;
        if(company.equals("Nasa") || salary >= 100000) {
            System.out.println("Thank you for the offer, I accept.");
        } else {
            System.out.println("Thank you for your offer- let's negotiate the salary.");
        }
    }
}

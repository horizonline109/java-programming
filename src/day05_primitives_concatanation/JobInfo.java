package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String [] args){
        String title = "Java SDET";
        String company= "Apple";
        String jobDescription = "Software Developer Engineer in Testing with expererience in Java, Cucumber, Selenium, Sql.";
        double salary = 100000.00;
        byte yearsExperience = 5;
        boolean hasBenefits = true;

        System.out.println("Job Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Job Description: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Years Experience Required: " + yearsExperience);
        System.out.println("Has benefits? - " + hasBenefits);
    }
}

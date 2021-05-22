package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.equals(""));

        if (jobTitle.isEmpty()) ;
        {
            System.out.println("JobTitle is missing, please resend");
        }
        if (jobTitle.length() == 0) {
            System.out.println("jobTitle is empty");
        } else {
            System.out.println("job title is not empty");
        }

        System.out.println(jobTitle.equals(""));
        if ("".equals(jobTitle)) {
            System.out.println("job title is empty");
        } else {
            System.out.println("job title is not empty");
        }

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); //false
        //if veggie is not empty, print we have carrots
        if (!veggie.isEmpty()) {
            System.out.println("We have carrots");
        }



        
        
        
    }
}
package day19_class_vs_object_strings;

public class LogInTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "CYBErTEK";
        String password = "Abi123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user successfullly logged in");
        } else {
            if(!expUserName.equalsIgnoreCase(userName)){
                System.out.println("Fail - username is incorrect");
            } else{
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}

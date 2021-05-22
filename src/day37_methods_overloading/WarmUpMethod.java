package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("CybertekStudent", "abc123");
        login("cybertekstudent", "abd989");
    }

        public static void loginVoid(String username, String password) {
            System.out.println("* * * Welcome to Cybertek Student Portal * * *");
            System.out.println("Please Enter your Username and Password below:");
            System.out.println("Username: " + username);
            System.out.print("Password: ");
            for(int i = 0; i < password.length(); i++){
                System.out.print("•");
            }
            System.out.println();
            String secretUsername = "cybertekStudent";
            String secretEmail = "student@cybertek.com";
            String secretPassword = "abc123";

            if((username.equalsIgnoreCase(secretUsername) || username.equalsIgnoreCase(secretEmail))
                    && password.equals(secretPassword)){
                System.out.println("Login is valid");
            }else{
                System.out.println("Please check your login credentials");
            }

            if(login("cybertekStudent", "abc123")){
                System.out.println("Login successful, welcome to Canvas");
            } else {
                System.out.println("Login failed");
            }

            }

    public static boolean login(String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if(userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
            return true;
        }
            return false;
    }
}

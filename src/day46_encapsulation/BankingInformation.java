package day46_encapsulation;

public class BankingInformation {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setBalance(1500.02);
        account.setAccountNumber(1905040);
        account.setAccountHolder("Mary Barfield");
        account.getType();
        System.out.println(account.toString());

        String st = "Group-9";
        String altst = "Group-9";
        st = st.concat(" is great!");
        System.out.println(st);
        System.out.println(altst);


    }
}

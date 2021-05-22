package day45_oop;

public class Coffee {
    int amount;
    String type;

    public void refill() {
        amount = 100;
    }

    public void drink(int someAmount) {
        int num = 22;
        amount -= someAmount;
        if (amount < 0) {
            System.out.println("Invalid amount. Please re-enter amount");
        }

    }

    public int getAmount() {
        return amount;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}

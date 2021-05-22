package solo_practice;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        if(floorNum == 1) {
            System.out.println("Flor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if(floorNum == 2) {
            System.out.println("Floor 2 selected. Companies, Cybertek, NASA, Inelsat");
        } else if(floorNum ==3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Steakhouse.");
        } else {
            System.out.println("Invalid floor - 6");
        }

        switch(floorNum) {
        case 1:
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            break;
            case 2:
            System.out.println("Floor 2 selected. Companies, Cybertek, NASA, Inelsat");
            case 3:
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Steakhouse.");
            default:
            System.out.println("Invalid floor - 6");
            break;
        }



    }
}

package solo_practice;

import java.util.Scanner;

public class ReplItComputerConfig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        double screenSize;
        String cpuType;
        int ramSize;
        String storageType;
        String resolution;

        System.out.println("Select screen size: ");
        screenSize = scan.nextDouble();
        //13.3
        if (screenSize == 13.3) {
            totalPrice += 200;
        }
        if (screenSize == 15.0) {
            totalPrice += 300;
        }
        if (screenSize == 17.3) {
            totalPrice += 400;
        }

        // totalPrice = 200

        System.out.println("Select CPU type:");
        cpuType = scan.next();
        //i7
        if (cpuType.equals("i3")) {
            totalPrice += 150;
        }
        if (cpuType.equals("i5")) {
            totalPrice += 250;
        }
        if (cpuType.equals("i7")) {
            totalPrice += 350;
        }

        // totalPrice = 450

        System.out.println("Select RAM size:");
        ramSize = scan.nextInt();
        totalPrice = totalPrice + (ramSize/4) * 50;

        // 650

        System.out.println("Select storage type:");
        storageType = scan.next();
        //SSD

        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();
        //2000GB
        if(storageType.equals("HDD")) {
            totalPrice += (memorySize/500) *50;
        } if(storageType.equals("SSD")) {
            totalPrice += (memorySize/500) * 100;
        }

        //totalPrice = $850

        System.out.println("Enter screen resolution:");
        resolution = scan.next();
        if(resolution.equals("FULLHD")) {
            totalPrice += 100;
        } if(resolution.equals("4K")) {
            totalPrice += 200;
        }
        //4K --totalPrice = $1050

        System.out.println("Laptop price is: $" + totalPrice);
    }

}
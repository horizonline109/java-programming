package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String [] student1 = {"Mary", "Jane", "000000", "B22", "123-4040"};
        String [] student2 = {"Mohammed", "MasterMind", "111111", "B22", "555-4444"};
        String[] student3 = {"Ramin,", "Spiderman", "222222", "B22", "999-9999"};
        String[] student4 = {"Bahar,", "IsCool", "333333", "B22", "800-"};
        String[] student5 = {"Elvira,", "SmartGirl", "444444", "B22", "Elvira"};

        System.out.println("***** STUDENT INFORMATION *****");
        System.out.println("student1 ID = " + student1[2]);
        System.out.println("student1 firstName = " + student1 [0]);
        System.out.println("student1 lastName = " + student1 [1]);
        System.out.println("student1 batch num = " + student1 [3]);
        System.out.println("student1 phone num = " +student1 [4]);

        System.out.println("student1 data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("Data has correct length");
        } else {
            System.out.println("Data has incorrect length");
        }

        //if(student1.length == 5 && student2.length == 5) {
        if(student1.length == student2.length){
            System.out.println("PASS: Data length match");
        } else {
            System.out.println("FAIL: Data length does not match");
        }

        System.out.println(student1[0].toUpperCase() + " " + student1[1].toUpperCase());




    }
}

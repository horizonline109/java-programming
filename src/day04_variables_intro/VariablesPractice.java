package day04_variables_intro;

public class VariablesPractice {
    public static void main(String [] args) {
        //declare variable students that store number
        int students;
        //assign 50 to students
        students = 50;
        System.out.println(students); //50
        System.out.println(students); //50
        students = 70;
        System.out.println(students); //70
        students = 150;
        students = 125;
        System.out.println(students); //125

        int teachers;
        teachers = 2;
        int mentors;
        mentors = 25;
        System.out.println(teachers); //2

        System.out.print("Number of teachers: ");
        System.out.println(teachers);
        System.out.print("Number of mentors: ");
        System.out.println(mentors); //25
        System.out.println(students); //125

    }
}

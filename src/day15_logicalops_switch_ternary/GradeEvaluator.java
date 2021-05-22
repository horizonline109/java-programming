package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'C';
        if(grade == 'A' || grade == 'B' || grade =='C') {
            System.out.println("Your grade is: " + grade);
            System.out.println("Pass");
        } else if(grade == 'D' || grade == 'd') {
            System.out.println("Your grade is: " + grade);
            System.out.println("You have not passed. Qualified for retake. Please contact instructor.");
        } else if(grade == 'F' || grade == 'f') {
            System.out.println("Fail. Please review your notes.");
        } else {
            System.out.println("Invalid grade. Please contact IT support.");
        }
    }
}

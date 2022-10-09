import java.util.Scanner;

public class StudentGrade {
    static int marks;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();
        if (marks >= 70) {
            System.out.println("Distiction");
        } else if (marks > 60){
            System.out.println("Firstclass");}
        else if (marks>35) {
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }
    }}


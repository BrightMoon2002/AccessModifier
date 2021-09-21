package exercise3;

import staticmethod.Student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Test access modifier class Student");

        StudentC02 student1 = new StudentC02();
        System.out.println(student1.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the class:");
        String classes = scanner.nextLine();
        student1.setName(name);
        student1.setClasses(classes);
        System.out.println("student2 is: " + student1.toString());


    }
}

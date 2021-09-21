package staticmethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initial
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    //Method display
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

package staticmethod;

public class TestStacticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(111, "Hoàng");
        Student student2 = new Student(222, "Nam");
        Student student3 = new Student(333, "Khánh");

        student1.display();
        student2.display();
        student3.display();
    }
}

package accessmodifier;



public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Test circle, set radius and color of circle:");


        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println("The radius of circle is: " + circle1.getArea());
        System.out.println("The Area of circle is: " + circle1.getArea());
        circle1.setColor("Yellow");
        circle1.setRadius(2);
        System.out.println(circle1.toString());
    }
}

package triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Shape----");
        Shape shape= new Shape();
        System.out.println(" Shape không tham số : "+ shape);
        shape.setColor("red");
        shape.setFilled(true);
        System.out.println("Shape sau khi set: "+shape);

        System.out.println("-----Triangle-----");
        Triangle triangle=new Triangle();
        System.out.println("lớp tam giác mặc định :"+triangle);
        Triangle triangle2=new Triangle(5,7,3);
        System.out.println("tam giác thay đổi: "+triangle2);

        System.out.println("diện tích: "+triangle2.getArea());




    }
}

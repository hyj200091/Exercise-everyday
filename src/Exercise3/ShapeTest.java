package Exercise3;



public class ShapeTest {
    public static void main(String[] args) {
        Shape shape  = new Rectangle(4.0,3.0);
        System.out.println("矩形的面积是：" +shape.getMj());

        Shape shape1 = new Circle(4.0,3.0);
        System.out.println("圆形的面积是：" +shape1.getMj());
    }
}

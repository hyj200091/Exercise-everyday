package Exercise3;

public class Rectangle extends Shape {
    public Rectangle(){
        super();
    }

    public Rectangle(double x, double y) {
        //在构造方法中给父类属性x和y初始化，通过super.x和super.y访问父类属性
        super.x=x;
        super.y=y;
    }
    @Override
    public double getMj() {
        return this.x*this.y;
    }
}

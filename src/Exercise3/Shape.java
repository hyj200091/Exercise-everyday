package Exercise3;

/**
 * 创建Shpae类
 */

public abstract class Shape {
    protected double x;
    protected double y;
   //全参构造器
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //无参构造器
    public Shape(){
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public abstract double getMj();
}


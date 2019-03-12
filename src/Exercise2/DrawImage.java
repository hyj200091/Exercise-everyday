package Exercise2;

/**
 * 定义各种矩形 正方形 菱形的接口 以及draw的实现方法
 * 侯粤嘉 2019年3月10号
 */

 interface DrawImage {
     public void draw();
}
class Rectangle implements DrawImage{
    public void draw() {
        System.out.println("画矩形");
    }
}
class Square implements DrawImage{
    public void draw() {
        System.out.println("画正方形");
    }
}
class Diamond implements DrawImage{
    public void draw() {
        System.out.println("画菱形");
    }
}

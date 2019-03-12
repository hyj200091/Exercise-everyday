package Exercise2;

public class SpeciaParallelogram {
    public static void main(String[] args) {
        //接口也可以进行向上转型操作
        DrawImage[] images = {new Rectangle(),new Square(),new Diamond()};
        //遍历画图形 接口类型的数组
        for (int i = 0; i<images.length; i++) {
            //调用draw（）的方法
            images[i].draw();
        }
    }
}

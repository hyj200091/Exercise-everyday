package Exercise1;

import javax.swing.*;
import java.awt.*;

public class FlowLayouTest extends JFrame {
    public FlowLayouTest(){
        setTitle("窗体使用流式布局");
        Container c = getContentPane();
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        c.add(new JLabel("下面那四句诗是描写夏天的?"));
        c.add(new JLabel("A 秋风萧瑟天气凉，草木遥漾露为霜"));
        c.add(new JLabel("B 白雪纷纷何所似，撒盐空中差可拟"));
        c.add(new JLabel("C 接天莲叶无穷碧，映日荷花别样红"));
        c.add(new JLabel("D 竹外桃花三两枝，春江水暖鸭先知"));
        setSize(350,250);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayouTest();
    }
}

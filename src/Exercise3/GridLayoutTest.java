package Exercise3;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 网格布局
 * @author 侯粤嘉
 * 2019，3，27
 */
public class GridLayoutTest extends JFrame {
    private JPanel[] panels;
    private JLabel content;
    private JLabel imgLabel;
    private Icon icon;
    private JLabel dateLabel;

    private GridLayoutTest() {
        init();
        setTitle("GridLayout网格布局管理器");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        getContentPane().setBackground(new Color(255, 255, 255));
        GridLayout gridLayout = new GridLayout(3, 3, 50, 30);
        setLayout(gridLayout);
        panels = new JPanel[6];
        for (int i = 0; i < 6; i++) {
            panels[i] = new JPanel();
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i + 1)));
            add(panels[i]);
        }
        //第一个
        panels[0].setBackground(new Color(123, 121, 121));
        for (int i = 0; i < 5; i++) {
            panels[0].add(new JButton("Java"));
        }
        //第二个
        panels[1].setLayout(new BorderLayout(20, 20));
        panels[1].setBackground(new Color(230, 238, 156));
        panels[1].add(new JButton("北"), BorderLayout.NORTH);
        panels[1].add(new JButton("南"), BorderLayout.SOUTH);
        panels[1].add(new JButton("东"), BorderLayout.EAST);
        panels[1].add(new JButton("西"), BorderLayout.WEST);
        panels[1].add(new JButton("中"), BorderLayout.CENTER);
        //第三个
        panels[2].setLayout(new GridLayout(3, 3, 10, 10));
        panels[2].setBackground(new Color(255, 87, 34));
        //依次加入9个按钮
        for (int i = 0; i < 9; i++) {
            panels[2].add(new JButton(String.valueOf(i + 1)));
        }
        //第四个
        panels[3].setBackground(new Color(41, 182, 246));
        imgLabel = new JLabel();
        //读入本地图片的内存
        File srcFile = new File("D:/1.jpg");
        InputStream in ;
        byte[] bytes = null;
        try {
            in = new FileInputStream(srcFile);
            bytes = new byte[(int) srcFile.length()];
            in.read(bytes);
        }catch (IOException e){
            System.out.println("IO异常");
        }
        icon = new ImageIcon(bytes);
        imgLabel.setIcon(icon);
        panels[3].add(imgLabel);
        //第五个
        panels[4].setBackground(new Color(251, 233, 231));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        dateLabel =new JLabel(date);
        panels[4].add(dateLabel);
        //第六个
        panels[5].setBackground(new Color(255, 193, 7));
        panels[5].setLayout(new GridLayout(1, 2, 10, 10));
        for (int i =0;i<2;i++){
            panels[5].add(new JButton(String.valueOf(i+1)));
        }
    }
        public static void main (String[]args){
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new GridLayoutTest();
        }
    }

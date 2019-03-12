package Exercise5;

import java.util.Scanner;

public class Tmoato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天的西红柿单价(单价格式为:3.00)");
        //把控制台输入的西红柿单价赋值给变量dayPrice
        String dayPrice = sc.next();
        //控制太输入的字符串长度为4时
        if (dayPrice.length() == 4){
            try {
                String message = "西红柿:" +dayPrice +"元/500克";//西红柿的售价信息
                String[] strArr = message.split(":");//使用”：“ 拆分字符串
                String unitPriceStr = strArr[2].substring(0,4);//截取西红柿单价：2.29
                double weight =650;
                //将String类型的西红柿单价转换为double类型
                double unitPriceDou = Double.parseDouble(unitPriceStr);
                //输出顾客购买650克的西红柿需要支付的金额
                System.out.println(message + "，顾客购买了" + weight + "克的西红柿，需支付"
                +(float)(weight / 500*unitPriceDou)+"元");
            }catch (ArrayIndexOutOfBoundsException aiobe){
                aiobe.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }finally{
                sc.close();
                System.out.println("控制台输入对象被关闭。");
            }
        }else{
            //输出信息
            System.out.println("违规操作："+"输入西红柿单价时小数点必须保留两位有效小数！");
        }
    }
}

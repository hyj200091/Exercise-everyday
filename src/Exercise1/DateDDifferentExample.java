package Exercise1;
/**
 * 时间差值的计算
 * author 侯粤嘉
 * 2019.3.18
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDDifferentExample {
    public static void main(String[] args) {
        //分别定义起止时间
        String startTime = "2019-3-16 20:30:38";
        String stopTime = "2019-3-17 23:30:10";
        System.out.println("现在的时间为："+startTime);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 ;
        Date d2 ;
        long diff=0;
        //通过SimleDateFormat的对象来把String类型的时间对象转化成Date类型的对象
        try {
            d1 = format.parse(startTime);
            d2 = format.parse(stopTime);
            //毫秒ms的差值
            diff = d2.getTime() - d1.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        //将毫秒化成秒 分 小时 天
        long diffSeconds = diff/1000;
        long diffMinutes = diff/(1000*60);
        long diffHours = diff/(1000*60*60);
        long diffDays = diff/(1000*60*60*24);

        System.out.println("两个时间差为：" + Math.abs(diffSeconds)+"秒");
        System.out.println("两个时间差为：" + Math.abs(diffMinutes)+"分");
        System.out.println("两个时间差为：" + Math.abs(diffHours)+"小时");
        System.out.println("两个时间差为：" + Math.abs(diffDays)+"天");
    }
}

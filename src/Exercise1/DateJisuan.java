package Exercise1;
/**
 * 时间差值就算2
 * author 侯粤嘉
 * 2019.03.18
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateJisuan {
    public static void main(String[] args) {
        //创建日期
        Date date = new Date();
        DateFormat df5 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String stopTime = df5.format(date);
        System.out.println("现在的时间为：" + df5.format(date));
        //分别定义起止时间
        String t1Time = "2019-03-18 08:19:38";
        String t2Time = "2019-03-18 08:10:10";
        String t3Time = "2019-03-18 04:00:03";
        String t4Time = "2019-03-17 08:00:23";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d3;
        Date d1 ;
        Date d2;
        Date d4;
        Date d5;
        long diff = 0;
        long diff11 = 0;
        long diff22=0;
        long diff44=0;
        //通过SimleDateFormat的对象来把String类型的时间对象转化成Date类型的对象
        try {
            d5 = format.parse(t2Time);
            d1 = format.parse(t1Time);
            d2 = format.parse(stopTime);
            d3 = format.parse(t3Time);
            d4 = format.parse(t4Time);
            //毫秒ms的差值
            diff = d2.getTime()- d1.getTime();
            diff11 = d2.getTime() - d5.getTime();
            diff22 = d2.getTime() - d3.getTime();
            diff44 = d2.getTime() - d4.getTime();
        }catch (ParseException e) {
            e.printStackTrace();
        }
        long diffSd = diff/1000;
        long diffMinutes = diff11/(1000*60);
        long diffHours = diff22/(1000*60*60);
        long diffDays = diff44/(1000*60*60*24);

        System.out.println(t1Time+ " " + Math.abs(diffSd)+"秒前");
        System.out.println(t2Time+" " + Math.abs(diffMinutes)+"分钟前");
        System.out.println(t3Time+" " + Math.abs(diffHours)+"小时前");
        System.out.println(t4Time+" "+ Math.abs(diffDays)+"天前");
    }
}

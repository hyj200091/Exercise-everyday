package Exericese7;
/**
 * 关于JDK8的时间与日期的获取
 * author 侯粤嘉
 *2019.3.15
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date : "+today);
        //在Java 8中获取年、月、日信息
        LocalDate today1 = LocalDate.now();
        int year = today1.getYear();
        int month = today1.getMonthValue();
        int day = today1.getDayOfMonth();
        System.out.printf("Year : %d  Month : %d  day : %d t %n", year, month, day);
        //在Java 8中处理特定日期
        LocalDate dateOfBirth = LocalDate.of(2019, 03, 15);
        System.out.println("Your Date of birth is : " + dateOfBirth);
        //在Java 8中判断两个日期是否相等
        LocalDate date1 = LocalDate.of(2019, 03, 15);
        if(date1.equals(today)){
            System.out.printf("Today %s and date1 %s are same date %n", today, date1);
        }
        LocalDate dateOfBirth1 = LocalDate.of(2019, 03, 15);
        MonthDay birthday = MonthDay.of(dateOfBirth1.getMonth(), dateOfBirth1.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);
        if(currentMonthDay.equals(birthday)){
            System.out.println("Many Many happy returns of the day !!");
        }else{
            System.out.println("Sorry, today is not your birthday");
        }

        //在Java 8中获取当前时间
        LocalTime time = LocalTime.now();
        System.out.println("local time now : " + time);
        //如何在现有的时间上增加小时
        LocalTime time1 = LocalTime.now();
        LocalTime newTime = time1.plusHours(2); // adding two hours
        System.out.println("Time after 2 hours : " +  newTime);
        //如何计算一周后的日期
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is : " + today);
        System.out.println("Date after 1 week : " + nextWeek);

        //计算一年前或一年后的日期
        LocalDate previousYear = today.minus(1, YEARS);
        System.out.println("Date before 1 year : " + previousYear);
        LocalDate nextYear = today.plus(1, YEARS);
        System.out.println("Date after 1 year : " + nextYear);
        //使用Java 8的Clock时钟类
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock);
        Clock defaultClock1 = Clock.systemDefaultZone();
        System.out.println("Clock : " + clock);
        //如何用Java判断日期是早于还是晚于另一个日期
        LocalDate tomorrow = LocalDate.of(2019, 03, 15);
        if(tomorrow.isAfter(today)){
            System.out.println("Tomorrow comes after today");
        }
        LocalDate yesterday = today.minus(1, DAYS);
        if(yesterday.isBefore(today)){
            System.out.println("Yesterday is day before today");
        }
        //在Java 8中处理时区
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localtDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork  = ZonedDateTime.of(localtDateAndTime, america );
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);
        //如何表示信用卡到期这类固定日期，答案就在YearMonth
        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2019, Month.MARCH);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
        //如何在Java 8中检查闰年
        if(today.isLeapYear()){
            System.out.println("This year is Leap year");
        }else {
            System.out.println("2019 is not a Leap year");
        }

        //计算两个日期之间的天数和月数
        LocalDate java8Release = LocalDate.of(2019, Month.MARCH, 15);
        Period periodToNextJavaRelease = Period.between(today, java8Release);
        System.out.println("Months left between today and Java 8 release : "
                + periodToNextJavaRelease.getMonths() );
        //包含时差信息的日期和时间
        LocalDateTime datetime = LocalDateTime.of(2019, Month.MARCH, 15, 19, 30);
        ZoneOffset offset = ZoneOffset.of("+05:30");
        OffsetDateTime date = OffsetDateTime.of(datetime, offset);
        System.out.println("Date and Time with timezone offset in Java : " + date);
        //在Java 8中获取当前的时间戳
        Instant timestamp = Instant.now();
        System.out.println("What is value of this instant " + timestamp);
        //在Java 8中如何使用预定义的格式化工具去解析或格式化日期
        String dayAfterTommorrow1 = "20190315";
        LocalDate formatted = LocalDate.parse(dayAfterTommorrow1,
                DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated from String %s is %s %n",
                dayAfterTommorrow1, formatted);

        //如何在Java中使用自定义格式化工具解析日期
        String goodFriday = "2019.03.15";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate holiday = LocalDate.parse(goodFriday, formatter);
            System.out.printf("Successfully parsed String %s, date is %s%n", goodFriday, holiday);
        } catch (DateTimeParseException ex) {
            System.out.printf("%s is not parsable!%n", goodFriday);
            ex.printStackTrace();
        }
        //在Java 8中如何把日期转换成字符串
        LocalDateTime arrivalDate  = LocalDateTime.now();
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM-dd- yyyy  hh:mm a");
            String landing = arrivalDate.format(format);
            System.out.printf("Arriving at :  %s %n", landing);
        } catch (DateTimeException ex) {
            System.out.printf("%s can't be formatted!%n", arrivalDate);
            ex.printStackTrace();
        }

    }
}

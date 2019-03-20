package Exercise4;

import java.util.Scanner;
enum Day {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五");
    String dayName;

    Day(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }

    public static Day getDay(String dayName) {
        switch (dayName) {
            case "mon":
                return Day.MONDAY;
            case "tues":
                return Day.TUESDAY;
            case "wed":
            return Day.WEDNESDAY;
            case "thu":
                return Day.THURSDAY;
            case "fri":
                return Day.FRIDAY;
        }
        return null;
    }
}
    public class EnumTest {
        public static void main(String[] args) {
            System.out.println("请输入单词小写");
            Scanner scanner = new Scanner(System.in);
            Day day = Day.getDay(scanner.next());
            switch (day) {
                case MONDAY:
                    System.out.println("MONDAY--" + day.getDayName());
                    break;
                case TUESDAY:
                    System.out.println("TUESDAY--" + day.getDayName());
                    break;
                case WEDNESDAY:
                    System.out.println("WEDNESDAY--" + day.getDayName());
                    break;
                case THURSDAY:
                    System.out.println("THURSDAY--" + day.getDayName());
                    break;
                case FRIDAY:
                    System.out.println("FRIDAY--" + day.getDayName());
                    break;
            }
            scanner.close();
        }
    }



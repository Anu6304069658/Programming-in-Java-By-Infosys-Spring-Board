//Selection Control Structure - Assignment 7
import java.time.LocalDate;

public class DateGenartor {
    public static void main(String[] args) {
        int day=1,month=9,year=15;
        if (year < 100)
            year += 2000;
         LocalDate date = LocalDate.of(year, month, day);
        LocalDate nextDate = date.plusDays(1);


        System.out.println("Next Date: " + nextDate.getDayOfMonth() + "-" +
                           nextDate.getMonthValue() + "-" +
                           nextDate.getYear());
    }
}

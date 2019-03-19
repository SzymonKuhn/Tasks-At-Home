package pl.szymonkuhn.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WeekdaysOfBirthdays {

    public static void main(String[] args) {
        weekdaysOfBirthdays(10);
    }


    static void weekdaysOfBirthdays (int numberOfYears){
        LocalDate birth = LocalDate.of(2019, 8, 03);
        for (int i = 1; i <=numberOfYears; i++){
            System.out.println(birth.plusYears(i).format(DateTimeFormatter.ofPattern("'W roku: 'YYYY ' to będzie ' EEEE")));
        }
    }



}

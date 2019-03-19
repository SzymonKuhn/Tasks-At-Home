package pl.szymonkuhn.dateTime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class localDateTimeTasks {

    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime birthHour = LocalDateTime.of(1984, 8, 3, 12, 00);

        LocalDate birth = LocalDate.of(1984, 8,03);
        System.out.println(birth);

        LocalDate today = LocalDate.now();

        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTimeNow);

        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);

        System.out.println(birth.format(DateTimeFormatter.ofPattern("'rok: 'yy 'miesiąc 'MMMM 'dzień 'dd 'dzień tygodnia 'EE")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("'rok:' yy MMMM dd")));
        System.out.println("Instant: " + instant);

        System.out.println("Od urodzin minęło: "+ Period.between(birth, today));
        System.out.println("Od urodzin minęło: "+ Period.between(birth, today).getDays() + " dni.");
        System.out.println("Od urodzin minęło: " + Duration.between(birthHour, now));
        System.out.println("Od urodzin minęło: " + Duration.between(birthHour, now).getSeconds() + " sekund.");
        System.out.println("Od urodzin minęło: " + ((Duration.between(birthHour, now).getSeconds())/60) + " minut.");
        System.out.println("Od urodzin minęło: " + ((Duration.between(birthHour, now).getSeconds())/(60*60) + " godzin."));
        System.out.println("Od urodzin minęło: " + ((Duration.between(birthHour, now).getSeconds())/(60*60*24) + " dni."));
        System.out.println("Od urodzin minęło: " + ((Duration.between(birthHour, now).getSeconds())/(60*60*24*365) + " lat."));





    }

}

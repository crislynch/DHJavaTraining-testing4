//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Ottieni l'anno
//Ottieni il mese
//Ottieni il giorno
//Ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        String dataString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = getParse(dataString);

        //Ottieni l'anno
        int year = getYear(dateTime);
        System.out.println("Anno: " + year);

        //Ottieni il mese
        Month month = getMonth(dateTime);
        System.out.println("Mese: " + month);

        //Ottieni il giorno
        int day = getDay(dateTime);
        System.out.println("Giorno: " + day);

        //Ottieni il giorno della settimana
        DayOfWeek dayOfWeek = getDayOfWeek(dateTime);
        System.out.println("Giorno della settimana: " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }

    static LocalDateTime getParse(String dataString) {
        return LocalDateTime.parse(dataString, DateTimeFormatter.ISO_DATE_TIME);
    }

    static DayOfWeek getDayOfWeek(LocalDateTime dateTime) {
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        return dayOfWeek;
    }

    static int getDay(LocalDateTime dateTime) {
        int day = dateTime.getDayOfMonth();
        return day;
    }

    static Month getMonth(LocalDateTime dateTime) {
        Month month = dateTime.getMonth();
        return month;
    }

    static int getYear(LocalDateTime dateTime) {
        int year = dateTime.getYear();
        return year;
    }
}
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testGetParse() {
        String dateString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = Main.getParse(dateString);
        LocalDateTime expectedDate = LocalDateTime.parse(dateString, DateTimeFormatter.ISO_DATE_TIME);

        assertEquals(expectedDate, dateTime);
    }

    @Test
    void getDayOfWeek() {
        String dateString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = Main.getParse(dateString);
        DayOfWeek dayOfWeek = Main.getDayOfWeek(dateTime);
        DayOfWeek expecteddayOfWeek = dateTime.getDayOfWeek();

        assertEquals(expecteddayOfWeek, dayOfWeek);
    }

    @Test
    void getDay() {
        String dateString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = Main.getParse(dateString);
        int day = Main.getDay(dateTime);
        int expectedDay = dateTime.getDayOfMonth();

        assertEquals(expectedDay, day);
    }

    @Test
    void getMonth() {
        String dateString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = Main.getParse(dateString);
        Month month = Main.getMonth(dateTime);
        Month expectedmonth = dateTime.getMonth();

        assertEquals(expectedmonth, month);
    }

    @Test
    void getYear() {
        String dateString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = Main.getParse(dateString);
        int year = Main.getYear(dateTime);
        int expectedyear = dateTime.getYear();

        assertEquals(expectedyear, year);
    }
}
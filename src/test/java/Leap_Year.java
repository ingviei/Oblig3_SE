import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leap_Year {

    @Test
    public void Div_By_4_Is_Leap_Year() {
        assertEquals(true, LeapYear.isLeapYear(1995));
    }

    @Test
    public void Div_By_100_And_400_Is_Leap_Year() {
        assertEquals(true, LeapYear.isLeapYear(2000));
    }

    @Test
    public void Not_Div_By_4_Is_Not_Leap_Year () {
        assertEquals(false, LeapYear.isLeapYear(1999));
    }
    @Test
    public void Div_By_100_But_Not_400_Is_Not_Leap_Year() {
        assertEquals(false, LeapYear.isLeapYear(1700));
    }

}

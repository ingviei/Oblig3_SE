public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Year is leap year. Dividable by 100 AND 400");
                return true;
            }
            System.out.println("Year is NOT leap year. Dividable by 100, but NOT 400");
            return false;
        }
        else if (year % 4 == 0) {
            System.out.println("Year is leap year. Dividable by 4");
            return true;
        }
        System.out.println("Year is NOT leap year. Not dividable by 4");
        return false;

    }
}
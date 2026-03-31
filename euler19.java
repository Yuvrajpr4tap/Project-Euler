public class CountingSundays {
    public static void main(String[] args) {
        int dayOfWeek = 1;
        int sundayCount = 0;
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int month = 0; month < 12; month++) {
            dayOfWeek = (dayOfWeek + monthDays[month]) % 7;
        }
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 0; month < 12; month++) {
                if (dayOfWeek % 7 == 0) {
                    sundayCount++;
                }
                int days = monthDays[month];
                if (month == 1 && isLeapYear(year)) {
                    days = 29;
                }
                dayOfWeek = (dayOfWeek + days) % 7;
            }
        }
        System.out.println(sundayCount);
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
//Output:171

package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year < 1 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        int daysInMonth = switch (month) {
            case 2 -> isLeapYear ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        System.out.println(daysInMonth);
    }
}

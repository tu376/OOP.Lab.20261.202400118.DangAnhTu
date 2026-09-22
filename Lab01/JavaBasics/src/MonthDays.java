import java.util.Scanner;

public class MonthDays {

    static final String[] FULL_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Each row: {full, abbreviation, 3-letter, number}
    static final String[][] ALIASES = {
        {"january",   "jan.",  "jan", "1"},
        {"february",  "feb.",  "feb", "2"},
        {"march",     "mar.",  "mar", "3"},
        {"april",     "apr.",  "apr", "4"},
        {"may",       "may",   "may", "5"},
        {"june",      "june",  "jun", "6"},
        {"july",      "july",  "jul", "7"},
        {"august",    "aug.",  "aug", "8"},
        {"september", "sept.", "sep", "9"},
        {"october",   "oct.",  "oct", "10"},
        {"november",  "nov.",  "nov", "11"},
        {"december",  "dec.",  "dec", "12"}
    };

    static final int[] COMMON_YEAR_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static final int[] LEAP_YEAR_DAYS   = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = -1;
        while (month == -1) {
            System.out.print("Enter month (name, abbreviation, or number): ");
            String input = sc.nextLine().trim();
            month = parseMonth(input);
            if (month == -1) {
                System.out.println("Invalid month. Please enter again.");
            }
        }

        long year = -1;
        while (year == -1) {
            System.out.print("Enter year: ");
            String input = sc.nextLine().trim();
            year = parseYear(input);
            if (year == -1) {
                System.out.println("Invalid year. Please enter a non-negative integer, digits only.");
            }
        }

        boolean leap = isLeapYear(year);
        int days = daysInMonth(month, leap);

        System.out.println(FULL_NAMES[month - 1] + " " + year + " has " + days + " days.");

        sc.close();
    }

    static int parseMonth(String input) {
        String lower = input.toLowerCase();
        for (int i = 0; i < ALIASES.length; i++) {
            for (String alias : ALIASES[i]) {
                if (alias.equals(lower)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }


    static long parseYear(String input) {
        if (input.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return -1;
            }
        }
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    static boolean isLeapYear(long year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int daysInMonth(int month, boolean leap) {
        return leap ? LEAP_YEAR_DAYS[month - 1] : COMMON_YEAR_DAYS[month - 1];
    }
}
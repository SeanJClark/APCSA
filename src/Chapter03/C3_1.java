package Chapter03;

import java.util.Scanner;

/**
 * compute the weekdays
 *
 * @author Sean
 */
public class C3_1 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's date: ");
        int date = input.nextInt();
        System.out.println("Enter days elapsed: ");
        int elapsed = input.nextInt();
        int future_date = (date + elapsed) % 7;
        String day_of_week = "";
        switch (date) {
            case 0:
                day_of_week = "Sunday";
                break;
            case 1:
                day_of_week = "Monday";
                break;
            case 2:
                day_of_week = "Tuesday";
                break;
            case 3:
                day_of_week = "Wednesday";
                break;
            case 4:
                day_of_week = "Thursday";
                break;
            case 5:
                day_of_week = "Friday";
                break;
            case 6:
                day_of_week = "Saturday";
                break;
        }
        if (future_date == 0) {
            System.out.printf("Todays is %s and the future day is Sunday", day_of_week);
        } else if (future_date == 1) {
            System.out.printf("Todays is %s and the future day is Monday", day_of_week);
        } else if (future_date == 2) {
            System.out.printf("Todays is %s and the future day is Tuesday", day_of_week);
        } else if (future_date == 3) {
            System.out.printf("Todays is %s and the future day is Wednesday", day_of_week);
        } else if (future_date == 4) {
            System.out.printf("Todays is %s and the future day is Thursday", day_of_week);
        } else if (future_date == 5) {
            System.out.printf("Todays is %s and the future day is Friday", day_of_week);
        } else if (future_date == 6) {
            System.out.printf("Todays is %s and the future day is Saturday", day_of_week);
        }
    }
}

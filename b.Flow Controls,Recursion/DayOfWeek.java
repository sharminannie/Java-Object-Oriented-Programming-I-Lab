import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, remainder;
        N = scan.nextInt();
        remainder = N % 7;
        String DayOfWeek;
        switch (remainder) {
            case 0:
                DayOfWeek = "Saturday";
                break;
            case 1:
                DayOfWeek = "Sunday";
                break;
            case 2:
                DayOfWeek = "Monday";
                break;
            case 3:
                DayOfWeek = "Tuesday";
                break;
            case 4:
                DayOfWeek = "Wednesday";
                break;
            case 5:
                DayOfWeek = "Thursday";
                break;
            case 6:
                DayOfWeek = "Friday";
                break;
            default:
                DayOfWeek = "Invalid input";
        }
        System.out.println("DayOfWeek");

       break;
    }
}

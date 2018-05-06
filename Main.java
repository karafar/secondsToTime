import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long secInYear = 31536000;
        long secInMonth = 2592000;
        long secInDay = 86400;
        long secInHour = 3600;
        long userInp = 0;

        System.out.println("Enter a num greater than 0");
        while(userInp == 0) {
            try {
                userInp = scn.nextInt();
            } catch (Exception e) {
                System.out.println("Bad input");
            }
        }
        long numYears = 0;
        long numMonths = 0;
        long numDays = 0;
        long numHours = 0;
        long numSeconds = 0;

        if(userInp > secInYear) {
            numYears = (long)Math.floor(userInp / secInYear);
            userInp = userInp % secInYear;
        }
        if(userInp > secInMonth) {
            numMonths = (long)Math.floor(userInp / secInMonth);
            userInp = userInp % secInMonth;
        }
        if(userInp > secInDay) {
            numDays = (long)Math.floor(userInp / secInDay);
            userInp = userInp % secInDay;
        }
        if(userInp > secInHour) {
            numHours = (long)Math.floor(userInp / secInHour);
            userInp = userInp % secInHour;
        }
        numSeconds = userInp;

        System.out.println("Years: " + numYears + " Months: " + numMonths + " Days: " + numDays
                + " Hours: " + numHours + " Seconds: " + numSeconds);
    }
}

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ageCalculator {

    public static void main(String[] args) {
        // Example input dates and times
        LocalDateTime startDate = LocalDateTime.of(2022, 1, 1, 12, 0); // Replace with your start date and time
        LocalDateTime endDate = LocalDateTime.now(); // Replace with your end date and time

        // Calculate the difference in terms of days, months, and years
        Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());

        // Calculate the difference in terms of minutes, hours, and seconds
        Duration duration = Duration.between(startDate, endDate);

        // Display the results
        System.out.println("Difference in days: " + period.getDays());
        System.out.println("Difference in months: " + period.getMonths());
        System.out.println("Difference in years: " + period.getYears());

        System.out.println("Difference in minutes: " + duration.toMinutes());
        System.out.println("Difference in hours: " + duration.toHours());
        System.out.println("Difference in seconds: " + duration.toSeconds());

        // If you want to get the remaining hours, minutes, and seconds after extracting days
        long remainingHours = duration.minusDays(period.getDays()).toHours();
        long remainingMinutes = duration.minusDays(period.getDays()).minusHours(remainingHours).toMinutes();
        long remainingSeconds = duration.minusDays(period.getDays()).minusHours(remainingHours).minusMinutes(remainingMinutes).getSeconds();

        System.out.println("Remaining hours: " + remainingHours);
        System.out.println("Remaining minutes: " + remainingMinutes);
        System.out.println("Remaining seconds: " + remainingSeconds);
    }
}

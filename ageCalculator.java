import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ageCalculator {

    public static void main(String[] args) {
        //input dates and times
        LocalDateTime startDate = LocalDateTime.of(2022, 1, 1, 12, 0); 
        LocalDateTime endDate = LocalDateTime.now(); 

        //difference in terms of days, months, and years
        Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());

        //difference in terms of minutes, hours, and seconds
        Duration duration = Duration.between(startDate, endDate);

       
        System.out.println("Difference in days: " + period.getDays());
        System.out.println("Difference in months: " + period.getMonths());
        System.out.println("Difference in years: " + period.getYears());

        System.out.println("Difference in minutes: " + duration.toMinutes());
        System.out.println("Difference in hours: " + duration.toHours());
        System.out.println("Difference in seconds: " + duration.toSeconds());

        
        long remainingHours = duration.minusDays(period.getDays()).toHours();
        long remainingMinutes = duration.minusDays(period.getDays()).minusHours(remainingHours).toMinutes();
        long remainingSeconds = duration.minusDays(period.getDays()).minusHours(remainingHours).minusMinutes(remainingMinutes).getSeconds();

        System.out.println("Remaining hours: " + remainingHours);
        System.out.println("Remaining minutes: " + remainingMinutes);
        System.out.println("Remaining seconds: " + remainingSeconds);
    }
}

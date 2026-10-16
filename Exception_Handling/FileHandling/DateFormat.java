import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
class Find{
    public static void main(String args[]){
        String birthdate="24-11-1971";
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date=LocalDate.parse(birthdate,df);
        LocalDate today=LocalDate.now();

        Period d = Period.between(date, today);
        System.out.println(d.getYears());


    }
}
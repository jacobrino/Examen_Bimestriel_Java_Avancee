import java.time.LocalTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bonjour java\n\n");
   
   
        // Créer une heure spécifique
        LocalTime heureSpecifique = LocalTime.of(14, 30, 45);
        // Hours/Minutes/Seconds
        System.out.println("Heure spécifique : " + heureSpecifique);


        // Créer une date spécifique
        LocalDate dateSpecifique = LocalDate.of(2025, 2, 23);
        // Years/Months/Days

        System.out.println("Date spécifique : " + dateSpecifique);
    

    }
}

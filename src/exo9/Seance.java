package exo9;
import java.time.LocalDate;
import java.time.LocalTime;
public class Seance {
    private int numero;
    private LocalDate date;
    private LocalTime heure;
    private double tarif;
    private Film film;
    public Seance(int num, LocalDate d, LocalTime h, double tarif, Film film ){
        this.numero = num;
        this.date = d;
        this.heure = h;
        this.tarif = tarif;
        this.film = film;
    }
    public void afficher(){
        System.out.print("numéro de séance : " + this.numero + "\nle film projeté: " + this.film.getFilmTitle());
        System.out.println("Date: "+ this.date +", Heure : " + this.heure);
        System.out.println("Tarif : "+ this.tarif);
    }
}

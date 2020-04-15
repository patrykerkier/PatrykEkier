import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Osoba {
    String nazwisko;
    String imie;
    int wiek;
    String adres;
    String haslo;
    String datadol;
    int wypozyczone;
    boolean zalogowano;
    int rachunek=0;
    boolean przekroczonoKare;
    boolean zaleglosc;
    static ZonedDateTime zonedDateTime2 = ZonedDateTime.now();
    public void setParametry(String nazwisko, String imie, int id, int wiek, String adres, String haslo){

        this.nazwisko =nazwisko;
        this.imie = imie;
        this.wiek=wiek;
        this.adres=adres;
        this.haslo=haslo;
        this.datadol=datadol;
    }

void rejestracja(){

    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);
    Scanner scanner5 = new Scanner(System.in);
    Scanner scanner6 = new Scanner(System.in);
    System.out.println("Rejestracja");
    System.out.println("Podaj nazwisko: ");
    this.nazwisko = scanner1.nextLine();
    System.out.println("Podaj imie: ");
    this.imie=scanner2.nextLine();
    System.out.println("Podaj wiek: ");
    this.wiek=scanner3.nextInt();
    System.out.println("Podaj adres: ");
    this.adres=scanner4.nextLine();
    System.out.println("Podaj haslo:");
    this.haslo=scanner5.nextLine();
    System.out.println("Podaj date dolaczenia:");
    this.datadol=scanner6.nextLine();
}
}

import java.time.ZonedDateTime;

public class Cechy_wspolne {
    private Ksiazka  iloscStron;
    private Ksiazka gatunek;
    String nazwa;
    int numer;
    String dataWyd;
    String autor;
    String wydawnictwo;
    int cena;
    boolean wypozyczenie;
    int kara;
    int czasWypozyczenia;
    int osoba=-1;
    ZonedDateTime zonedDateTime1= ZonedDateTime.now();
    boolean karaDoliczona = false;

    public Cechy_wspolne(Ksiazka gatunek1) {
    }

    public Cechy_wspolne() {

    }

    public void setParametry(String nazwa, int numer, String dataWyd, String autor, String wydawnictwo, int cena, boolean wypozyczenie, int kara){
        this.nazwa = nazwa;
        this.numer = numer;
        this.dataWyd = dataWyd;
        this.autor= autor;
        this.wydawnictwo = wydawnictwo;
        this.cena = cena;
        this.wypozyczenie = wypozyczenie;
        this.kara = kara;

    }

    }




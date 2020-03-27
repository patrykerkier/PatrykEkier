package com.company;


class CechyWspolne
{
    public int nr;
    public String nazwa;
    public String data_wyd;
    public String autor;
    public String wydawnictwo;
    public int cena;
   public boolean wypozyczenie;
   public int kara;
    public int czas_wypozyczenia;

    void wypozycz()
    {
          if(wypozyczenie=true)
         System.out.println("Wypozyczasz "+ nazwa +" na czas "+ czas_wypozyczenia +" dni. Kara za kazdy dzien spoznienia wynosi "+ kara +" zlote. ");
       else
              System.out.println(" nie da sie wypozyczyc");
    }
}

class Ksiazka extends CechyWspolne
{
    public int strony;
    public String gatunek;


}

class Plyta_CD extends CechyWspolne
{
    public int pojemnosc;

}

class Ebook extends CechyWspolne
{
    public int rozmiar;

}

class Film extends CechyWspolne
{
    public int rozmiar;
    public String gatunek;

}

class Audiobook extends CechyWspolne
{
    public int rozmiar;

}


public class Main {

    public static void main(String[] args) {

Audiobook plyta1=new Audiobook();
plyta1.nazwa="pan tadek";
plyta1.wypozyczenie=true;
plyta1.cena=17;
plyta1.kara=3;
plyta1.czas_wypozyczenia= 30;
plyta1.wypozycz();



    }
}
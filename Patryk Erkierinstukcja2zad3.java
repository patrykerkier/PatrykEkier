package com.company;
import java.util.Scanner;





class Osoba
{
 public  String imie;
 public  String nazwisko;
 public  String adres;
 public int wiek;
 public String data_dolaczenia;
 int karaosoby;
    int lwypozyczen;
void rejestracja()
{
 System.out.println("Podaj imie: ");
    Scanner scan = new Scanner(System.in);
    imie= scan.nextLine();
    System.out.println("Podaj nazwisko: ");
    Scanner scan1 = new Scanner(System.in);
    nazwisko= scan1.nextLine();
    System.out.println("Podaj adres: ");
    Scanner scan2 = new Scanner(System.in);
    adres= scan2.nextLine();
    System.out.println("Podaj wiek: ");
    Scanner scan3 = new Scanner(System.in);
    wiek= scan3.nextInt();
    System.out.println("Podaj date dolaczenia do biblioyteki: ");
    Scanner scan4 = new Scanner(System.in);
    data_dolaczenia= scan4.nextLine();

}

void wypozyczenie()
{String a;
String b;

   // System.out.println("zaloguj sie");
  //  System.out.println("jak masz na imie?");
  //  Scanner scan6 = new Scanner(System.in);
  //  a =scan6.nextLine();
  //  System.out.println("jak masz na nazwisko?");
  //  Scanner scan7 = new Scanner(System.in);
 //   b= scan7.nextLine();
    System.out.println("czy masz jakas zalegla kare? jesli nie wcisnij 0 jesli tak wcisnij 1 ");
    Scanner scan9 = new Scanner(System.in);
    karaosoby= scan9.nextInt();

    if(karaosoby==0) {
        System.out.println(" Witaj " + imie + " mozesz wypozyczyc dowolna rzecz. Twoja ilosc wypozyczyen to : " + lwypozyczen);

lwypozyczen++;
    }
    if( karaosoby==1) {
        System.out.println("konto zablokowane!!!! Oplac kare!!!!");
    }


    }

}











public class Main {

    public static void main(String[] args) {







        Osoba osoba1[] = new Osoba[10];

        for (int nr = 0; nr <= 10; nr++) {

            System.out.println("jesli nie posiadasz konta wpisz  1");
            System.out.println("jesli posiadasz konto i chcesz cos wypozyczyc wcisnij 2");
            int x;
            Scanner scan5 = new Scanner(System.in);
            x = scan5.nextInt();
            if (x == 1) {
                osoba1[nr]= new Osoba();
                osoba1[nr].rejestracja();
                System.out.println("dziekujemy za rejestracje. ");
                System.out.println("twoj nr logowania to "+ nr);
            }


            if (x == 2) {
                System.out.println("Podaj nr logowania: ");
                int y;
                Scanner scan10 = new Scanner(System.in);
                y = scan10.nextInt();
                osoba1[y].wypozyczenie();
            }
        }

    }
}
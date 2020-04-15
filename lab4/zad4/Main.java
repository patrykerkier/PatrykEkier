import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
 static Osoba[] osoba1 = new Osoba[10];
// static Ksiazka ksiazka1 = new Ksiazka();
 static PlytyCD plytyCD1 = new PlytyCD();
 static Ebook ebook1 = new Ebook();
 static Film film1 = new Film();
 static Audiobook audiobook1 = new Audiobook();
static int numerOsobyZalogowanej;
static Cechy_wspolne[] cechy_wspolne = new Cechy_wspolne[5];
   static ZonedDateTime zonedDateTime = ZonedDateTime.now();
   static  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
   static  int counter=0;
    public static void main(String[] args){

ZonedDateTime zonedDateTime1 =zonedDateTime;
            //biblioteka
           Cechy_wspolne ksiazka1 = new Cechy_wspolne(new Ksiazka(300, "Gatunek1"));
           ksiazka1.setParametry("ksiazka1", 1, "1.2.1998", "Kowalski", "Pomarańcza", 100, false, 100);
           //ksiazka1.setIloscStron(300);
          // ksiazka1.setGatunek("Gatunek1");
           cechy_wspolne[0] = new Cechy_wspolne();
           cechy_wspolne[0].setParametry("ksiazka1", 1, "1.2.1998", "Kowalski", "Pomarańcza", 100, false, 50);
           plytyCD1.setParametry("plytaCD1", 2, "3.2.1998", "Kowalczyk", "PomarańczaCD", 120, false, 100);
           plytyCD1.setPojemnosc(50);
           cechy_wspolne[1] = new Cechy_wspolne();
           cechy_wspolne[1].setParametry("plytaCD1", 2, "3.2.1998", "Kowalczyk", "PomarańczaCD", 120, false, 50);
           ebook1.setParametry("ebook1", 3, "1.3.1998", "Kowal", "PomarańczaEBOOK", 60, false, 40);
           ebook1.setPojemnosc(70);
           cechy_wspolne[2] = new Cechy_wspolne();
           cechy_wspolne[2].setParametry("ebook1", 3, "1.3.1998", "Kowal", "PomarańczaEBOOK", 60, false, 40);
           film1.setParametry("film1", 4, "2.1.1998", "KowalskiJan", "PomarańczaFILMA", 100, false, 50);
           film1.setGatunek("Horror");
           film1.setPojemnosc(175);
           cechy_wspolne[3] = new Cechy_wspolne();
           cechy_wspolne[3].setParametry("film1", 4, "2.1.1998", "KowalskiJan", "PomarańczaFILMA", 100, false, 50);
           audiobook1.setParametry("audiobook", 5, "1.2.1998", "Kowalski213", "PomarańczaAUDIOBOOK", 170, false, 50);
           audiobook1.setPojemnosc(300);
        cechy_wspolne[4] = new Cechy_wspolne();
           cechy_wspolne[4].setParametry("audiobook", 5, "1.2.1998", "Kowalski213", "PomarańczaAUDIOBOOK", 170, false, 50);

        //koniec bibilioteki

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        int a;


        while (true) {
            System.out.println("DZISIEJSZA DATA: " + zonedDateTime.format(formatter));
            System.out.println("wybierz co chcesz zrobić: ");
            System.out.println("1. Logowanie");
            System.out.println("2. Rejestracja");
             a = scanner.nextInt();

            if (a == 1 || a == 2) {
                switch (a) {
                    case 1:
                        logowanie();
                       break;

                    case 2:

                        osoba1 [counter] =  new  Osoba ();
                        osoba1[counter].rejestracja();


                        System.out.println(osoba1[counter].nazwisko);

                        counter++;

                        break;

                }
            } else {
                System.out.println("zła wartość");
            }


        }




    }
    static void logowanie(){
        String name1, haslo1;
        boolean zalogowano=false;
        Scanner scan = new Scanner(System.in);

        while(zalogowano==false) {
        System.out.println("LOGOWANIE");
        System.out.println("Podaj nazwisko");
        name1= scan.nextLine();
        System.out.println("Podaj haslo");
        haslo1=scan.nextLine();

            for (int i = 0; i < 10; i++) {
                if (osoba1[i].nazwisko.equals(name1)) {
                    if (osoba1[i].haslo.equals(haslo1)) {
                        System.out.println("Zalogowano, witamy Panie/Pani " + name1);
                        zalogowano = true;
                        numerOsobyZalogowanej = i;
                        osoba1[i].zalogowano=true;



                        menu(i);
                        break;

                    } else {
                        System.out.println("Złe haslo, albo nazwisko");
                        break;
                    }
                }
            }
        }


    }
    static void menu( int zmiennaMenu){
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        //boolean zaleglosc=false;
        int tab[] = new int[5];
        for(int i=0;i<5;i++){


        }


        while (menu == true) {
            int b;
            for(int n=0;n<5;n++) {
                if (zonedDateTime.isAfter(cechy_wspolne[n].zonedDateTime1) && osoba1[zmiennaMenu].wypozyczone == n+1){
                    System.out.println("MASZ ZALEGŁOŚĆ");
                    osoba1[numerOsobyZalogowanej].zaleglosc=true;


                }
            }
            //


//
            System.out.println("DZISIEJSZA DATA: " + zonedDateTime.format(formatter));
            System.out.println("Wybierz co chcesz zrobic");
            System.out.println("1. Wypozycz produkt");
            System.out.println("2. Oddaj produkt");
            System.out.println("3. kalendarz");
            System.out.println("4. wyloguj sie");
            for (int i=0;i<5;i++) {

                if (zonedDateTime.isAfter(cechy_wspolne[i].zonedDateTime1) && cechy_wspolne[i].osoba == numerOsobyZalogowanej  ){
                    if(cechy_wspolne[i].karaDoliczona==false) {
                        osoba1[numerOsobyZalogowanej].rachunek = osoba1[numerOsobyZalogowanej].rachunek + cechy_wspolne[i].kara;
//                        System.out.println(osoba1[numerOsobyZalogowanej].rachunek);
                        cechy_wspolne[i].karaDoliczona=true;

                    }
                }
            }
            b = scan.nextInt();
            switch (b) {
                case 1:
                    if(osoba1[numerOsobyZalogowanej].zaleglosc==true){



                        System.out.println("MASZ ZALEGŁOŚĆ");
                        System.out.println("oddaj produkt i zapłać kare: " + osoba1[numerOsobyZalogowanej].rachunek);
                        String ok = scan.nextLine();
                        break;
                    } else

                            osoba1[numerOsobyZalogowanej].rachunek = 0;


                    System.out.println("LISTA POZYCJI DO WYPOZYCZENIA: ");
                    int nr;
                   //   System.out.println("1. " + ksiazka1.nazwa);
                   // System.out.println("2. " + plytyCD1.nazwa);
                    //System.out.println("3. " + ebook1.nazwa);
                    //System.out.println("4. " + film1.nazwa);
                    //System.out.println("5. " + audiobook1.nazwa);
                    for(int i = 1; i <6 ; i++){
                        System.out.println(i+"."+ " "+ cechy_wspolne[i-1].nazwa);
                }

                    nr=scan.nextInt();
                   if(nr==1 && cechy_wspolne[0].wypozyczenie==true){
                        System.out.println("Ten produkt jest juz wypozyczony");
                    }
                    if(nr==2 && cechy_wspolne[1].wypozyczenie==true){
                      System.out.println("Ten produkt jest juz wypozyczony");
                    }
                    if(nr==3 && cechy_wspolne[2].wypozyczenie==true){
                      System.out.println("Ten produkt jest juz wypozyczony");
                   }
                   if(nr==4 && cechy_wspolne[3].wypozyczenie==true){
                       System.out.println("Ten produkt jest juz wypozyczony");
                   }
                   if(nr==5 && cechy_wspolne[4].wypozyczenie==true){
                        System.out.println("Ten produkt jest juz wypozyczony");
                    }


                   if(nr==1 && cechy_wspolne[0].wypozyczenie==false){


                       osoba1[numerOsobyZalogowanej].wypozyczone = cechy_wspolne[0].numer;
                        cechy_wspolne[0].wypozyczenie = true;
                        cechy_wspolne[0].osoba =zmiennaMenu;
                        cechy_wspolne[0].zonedDateTime1=zonedDateTime.plus(Period.ofDays(14));





                    }
                    if(nr==2 && cechy_wspolne[1].wypozyczenie==false){
                        osoba1[numerOsobyZalogowanej].wypozyczone = plytyCD1.numer;
                        cechy_wspolne[1].wypozyczenie = true;
                        cechy_wspolne[1].osoba =zmiennaMenu;
                        cechy_wspolne[1].zonedDateTime1=zonedDateTime.plus(Period.ofDays(14));


                    }
                    if(nr==3 && cechy_wspolne[2].wypozyczenie==false){
                        osoba1[numerOsobyZalogowanej].wypozyczone = ebook1.numer;
                        cechy_wspolne[2].wypozyczenie = true;
                        cechy_wspolne[2].osoba =zmiennaMenu;
                        cechy_wspolne[2].zonedDateTime1=zonedDateTime.plus(Period.ofDays(14));



                    }
                    if(nr==4 && cechy_wspolne[3].wypozyczenie==false){
                        osoba1[numerOsobyZalogowanej].wypozyczone = film1.numer;
                        cechy_wspolne[3].wypozyczenie = true;
                        cechy_wspolne[3].osoba =zmiennaMenu;
                        cechy_wspolne[3].zonedDateTime1=zonedDateTime.plus(Period.ofDays(14));




                    }
                    if(nr==5 && cechy_wspolne[4].wypozyczenie==false){
                        osoba1[numerOsobyZalogowanej].wypozyczone = audiobook1.numer;
                        cechy_wspolne[4].wypozyczenie = true;
                        cechy_wspolne[4].osoba =zmiennaMenu;
                        cechy_wspolne[4].zonedDateTime1=zonedDateTime.plus(Period.ofDays(14));




                    }



                    break;
                case 2:
                    System.out.println("Wybierz co chcesz oddać: ");
                    int nr2= 1;
                    int c;
                    for(int i=0; i <5; i++){

                        if(cechy_wspolne[i].wypozyczenie==true && cechy_wspolne[i].osoba == numerOsobyZalogowanej ){
                            System.out.println(cechy_wspolne[i].numer + "  " + cechy_wspolne[i].nazwa + " ; " + cechy_wspolne[i].autor + " ; " + cechy_wspolne[i].dataWyd);
                            tab[i]=cechy_wspolne[i].numer;
                            nr2++;
                        }
                    }



                    boolean a=true;

                    while(a) {
                        boolean ok = false;

                        c = scan.nextInt();




                        for (int i = 0; i < 5; i++) {

                            if (c == tab[i]) {

                                tab[i]=0;
                                cechy_wspolne[c - 1].wypozyczenie = false;
                                cechy_wspolne[c - 1].zonedDateTime1 = zonedDateTime;
                                System.out.println("oddales: " + cechy_wspolne[c - 1].nazwa);
                                osoba1[numerOsobyZalogowanej].rachunek =osoba1[numerOsobyZalogowanej].rachunek - cechy_wspolne[c-1].kara;
                                cechy_wspolne[c-1].karaDoliczona=false;
                                cechy_wspolne[c-1].osoba=-1;
                                a = false;
                                ok=true;

                                    if( cechy_wspolne[0].osoba != numerOsobyZalogowanej && cechy_wspolne[1].osoba != numerOsobyZalogowanej && cechy_wspolne[2].osoba != numerOsobyZalogowanej && cechy_wspolne[3].osoba != numerOsobyZalogowanej && cechy_wspolne[4].osoba != numerOsobyZalogowanej ){
                                        osoba1[numerOsobyZalogowanej].zaleglosc = false;
                                        osoba1[numerOsobyZalogowanej].rachunek=0;
                                        System.out.println("Wyczyszczono" + osoba1[numerOsobyZalogowanej].rachunek);
                                    }

                            }
                            }

                        if(ok==false){
                            System.out.println("Wprowadziłeś złą wartość, spróbuj jeszcze raz");
                        }

                        }





                    break;
                    case 3:

                    System.out.println("DZISIEJSZA DATA: " + zonedDateTime.format(formatter));
                    System.out.println("Wpisz ile dni do przodu: ");
                    int dniPlus = scan.nextInt();
                    zonedDateTime = zonedDateTime.plus(Period.ofDays(dniPlus));
                    break;

                case 4:
                    osoba1[zmiennaMenu].zalogowano=false;
                    menu=false;
                    break;

            }
        }

    }
}

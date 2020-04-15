import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tab[]= new int[10];
        for(int i=0; i<10; i++){
            tab[i]= 100 +i;
        }
        System.out.println("Który elemnt tablicy chcesz pozyskać? ");
        int number;

        try {
            number = scanner.nextInt();
            System.out.println(tab[number]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("wprowadziłeś liczbę spoza zakresu");
        }
        catch(InputMismatchException e){
            System.out.println("Wprowadziłeś inny znak niż liczba całkowita");

        }
    }

}
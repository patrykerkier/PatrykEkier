import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź znaki: ");
        String s = scanner.nextLine();
        System.out.println("Wprowadź liczbę radix: ");
        int radix = scanner.nextInt();

        try {
            System.out.println( Integer.parseInt(s, radix));
        } catch( NumberFormatException e){
            System.out.println("Wprowadziłeś złe dane");
        }
    }
    private static void parseInt(String s, int radix) {
    }
}


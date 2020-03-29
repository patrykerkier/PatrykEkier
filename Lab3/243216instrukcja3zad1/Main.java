

import java.util.Scanner;
import java.util.Random;

    public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Random r = new Random();


            int decyzja;
            int tab[] = new int[201];

            System.out.println("Wybierz rodzaj sortowania: 1 - bąbelkowe; 2 - kubełkowe    :");
            decyzja = in.nextInt();


            for (int i = 0; i < 200; i++) {      //wypełnienie tablicy liczbami
                tab[i] = r.nextInt(201);

                if(i !=0) {          // zeby nam sie nie powtarzalyu liczby
                    for (int k = 0; k < i; k++) {
                        if (tab[k] == tab[i]) {
                            tab[i] = r.nextInt(201);
                            k = 0;
                        }

                    }
                }
                System.out.print(tab[i] + " ; ");

            }

            System.out.println();
            System.out.println("po sortowaniu : ");








            if(decyzja==1) {
                bubble bubble = new bubble();
                bubble.sort(tab);
                for (int i = 0; i < 200; i++) {
                    System.out.print(tab[i] + " ; ");
                }
                System.out.println();
                bubble.step_counting();
            }
            else {

                BucketSort bucketSort = new BucketSort();
                bucketSort.sort(tab);
                bucketSort.step_counting();
            }




        }




    }


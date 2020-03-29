public class BucketSort implements Sortable {

    public int[] sort(int[] tab){

        int tab1[] = new int[201];
        int tab2[] = new int[200];
        for(int i=0;i<200;i++){
            tab1[i] = 0;
        }
        for(int i=0;i<200;i++){
            tab2[i] = i;
        }
        int a;
        int b;
        for (int i=0;i<200;i++){
            a=tab[i];
            tab1[a] = tab1[a] + 1;
        }



        for(int i =0; i< 200; i++){
            b=tab1[i];
            for (int k = 0; k<b; k++){
                System.out.print(tab2[i] + " ; ");
            }
        }


        return tab;

    }
    public double step_counting(){
        return 0;
    }
}

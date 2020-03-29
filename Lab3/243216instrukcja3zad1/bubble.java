public class bubble implements Sortable {
    double count = 0;

    public int[] sort(int[] tab) {
        int temp;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                    count++;
                }
            }
        }
        return tab;
    }

    public double step_counting() {
        System.out.println("Ilość porównań: " + count);
        return count;
    }


}
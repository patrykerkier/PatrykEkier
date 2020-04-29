public class odwrot {
    int[] odwrot(int[] tab){
        int[] tab1 = new int[tab.length];
        for(int i=1; i<tab.length + 1; i++){
            tab1[i-1]=tab[tab.length-i];
        }
        for(int i =0;i<tab.length;i++){
            System.out.println(tab1[i]);
        }

        return tab1;
    }
}

public class Sekwencja {

    boolean sekwencja(int tab[]){
        int a = tab.length;
        for(int i=0; i<a; i++){
            if(tab[i]==1){
                if(tab[i+1]==2){
                    if(tab[i+2]==3){
                        System.out.println("true");
                        return true;
                    }
                }
            }

        }
        System.out.println("false");
        return false;
    }

}

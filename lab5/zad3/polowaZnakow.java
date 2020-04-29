public class polowaZnakow {
    String polowaZnakow(String string){
        int a = Math.round(string.length()/2);
        char[] stringCh = string.toCharArray();
        char[] polowa = new char[a];
        for(int i=0; i<a; i++){
            polowa[i]=stringCh[i];
        }
        String stringPolowa = new String(polowa);
        System.out.println(stringPolowa);
        return stringPolowa;



    }


}

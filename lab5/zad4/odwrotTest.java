import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class odwrotTest {
  private  odwrot odwrot = new odwrot();
@Test
    void test1(){
    int[] tablica = {1,3,5,7};
    int[] tabreczna = {7,5,3,1};
       // odwrot.odwrot(tablica);
     int[] tablica1 = odwrot.odwrot(tablica);
     for (int i=0;i<tablica1.length;i++){
         assertEquals(tablica1[i], tabreczna[i]);
     }
}
}

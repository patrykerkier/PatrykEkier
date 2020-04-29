import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class polowaZnakowTest {
    private polowaZnakow polowaZnakow = new polowaZnakow();
    @Test
    void test1(){
        //w przypadku nieparzystej dlugosci stringa zaokr. w dol
        String polowaReczna = "TEK";
        assertEquals(polowaZnakow.polowaZnakow("TEKST1"), polowaReczna);
    }


}

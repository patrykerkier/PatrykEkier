import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SekwencjaTest {

    private Sekwencja sekwencja = new Sekwencja();

    @Test
void test1(){
        int[] tab;
        tab= new int[]{1, 6, 1, 5, 3};
        assertTrue(sekwencja.sekwencja(tab)==true);
    }
    @Test
    void test2(){
        int[] tab;
        tab= new int[]{6, 1, 2, 3, 3};
        assertTrue(sekwencja.sekwencja(tab)==true);
    }

}

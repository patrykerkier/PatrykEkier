import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TempTest {
    private Temp temp = new Temp();
    @Test
    void test1(){
        assertTrue(Temp.temp(123,150)==true);
    }
    @Test
    void test2(){
        assertTrue(Temp.temp(13,15)==true);
    }
}

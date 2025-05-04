import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion= new Lion (feline);
        lion.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens();
    }

    @Test
    public void doesHaveManeErrorHandlingTest() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Cамкец", feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());

    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion= new Lion (feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");

    }
}

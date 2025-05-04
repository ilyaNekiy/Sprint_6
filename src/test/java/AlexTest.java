import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    @Mock
    Feline feline;
    @Test
   public void getKittensTest() throws Exception {
        Alex alex= new Alex(feline);
        assertEquals(0, alex.getKittens());

    }
   @Test
   public void getFriendsTest () throws Exception {
       Alex alex= new Alex(feline);
       assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
   }
    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex= new Alex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
    @Test
    public void testHasManeShouldReturnTrue () throws Exception {
        Alex alex= new Alex(feline);
        assertEquals(true, alex.doesHaveMane());

    }
}

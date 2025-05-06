import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;



import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception {//spy
        feline.eatMeat();//SPY
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void getFamilyTest(){
        Feline feline= new Feline ();
        assertEquals("Кошачьи",feline.getFamily());
    }
    @Test
    public void getKittensTestWithoutAttributes(){
        feline.getKittens();//SPY
        Mockito.verify(feline,Mockito.times(1)).getKittens(1);
    }
    @Test
    public void getKittensTestWithAttributes(){
        Feline feline= new Feline ();
        assertEquals(5,feline.getKittens(5));
    }

}

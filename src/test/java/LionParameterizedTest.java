import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParameterizedTests {

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    @Mock
    Feline feline;

    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameter(1)
    public boolean expectedResultDoesHaveManeTest;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Самец",true},
                {"Самка",false}
        };

    }


    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion= new Lion (sex,feline);
        assertEquals(expectedResultDoesHaveManeTest,lion.doesHaveMane());
    }


}

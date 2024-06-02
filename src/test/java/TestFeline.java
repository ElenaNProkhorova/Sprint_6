import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
    @Spy
    Feline feline;

    @Test
    public void felineGetKittensNoParam () {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }


    @Test
    public void felineGetFamily () {
        String actual = feline.getFamily();
        Assert.assertEquals("Кошачьи", actual);

    }

    @Test
    public void felineEatMeat () throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}
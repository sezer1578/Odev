import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

/**
 * Created by SEZER on 2.05.2017.
 */
public class SingerTest {
    @Test
    public void CotainsSinger(){
        List<String> VolkanKonak = new ArrayList<String>(Arrays.asList("Aleni","Mimoza Çiçeğim","Göklerde Kartal Gibiyim"));
        assertThat(VolkanKonak, hasItems("Aleni","Mimoza Çiçeğim","Göklerde Kartal Gibiyim"));
        System.out.print("Singers " + true);


    }

}

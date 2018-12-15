package comman;

import common.Function;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FunctionTest {

    public final double DELTA=0.001;
@Test
    public void fermiTest(){


    assertEquals(0.5,Function.fermi(0),DELTA);
    assertEquals(0.761,Function.fermi(1.16),DELTA);
    assertEquals(0.603,Function.fermi(0.42),DELTA);

    }
}

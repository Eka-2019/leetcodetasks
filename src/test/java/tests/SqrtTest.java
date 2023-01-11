package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.Sqrt;

public class SqrtTest {

    @Test
    public void normalTest(){
        Sqrt test = new Sqrt();
        int actual = test.sqrtExample(36);

        Assertions.assertEquals(6, actual, "Unexpected return. Actual integer is: " + actual);
    }

    @Test
    public void zeroTest(){
        Sqrt test = new Sqrt();
        int actual = test.sqrtExample(0);

        Assertions.assertEquals(0, actual, "Unexpected return. Actual integer is: " + actual);
    }

    @Test
    public void oneTest(){
        Sqrt test = new Sqrt();
        int actual = test.sqrtExample(1);

        Assertions.assertEquals(1, actual, "Unexpected return. Actual integer is: " + actual);
    }

    @Test
    public void positiveTest(){
        Sqrt test = new Sqrt();
        int actual = test.sqrtExample(1000000000);

        Assertions.assertEquals(31622, actual, "Unexpected return. Actual integer is: " + actual);
    }

}

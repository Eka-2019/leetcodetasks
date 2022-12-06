package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.ReverseWordsInStringIII;

public class ReverseWordsInStringIIITest {

    @Test
    public void simplePositiveTest(){
        ReverseWordsInStringIII test = new ReverseWordsInStringIII();
        String actual = test.reverseWordsInString("God Ding");

        Assertions.assertEquals("doG gniD", actual, "Unexpected actual value. Actual value is: " + actual);
    }

    @Test
    public void symbolsInsideWordsTest(){
        ReverseWordsInStringIII test = new ReverseWordsInStringIII();
        String actual = test.reverseWordsInString("Let's take LeetCode contes&t_");

        Assertions.assertEquals("s'teL ekat edoCteeL _t&setnoc", actual, "Unexpected actual value. Actual value is: " + actual);
    }
}

package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.LengthOfLastWord;

public class LengthOfLastWordTest {

    @Test
    public void positiveTest(){
        LengthOfLastWord test = new LengthOfLastWord();
        int length = test.lengthOfLastWord("Hello World");

        Assertions.assertEquals(5, length, "Length is not expected. Length is " + length);
    }

    @Test
    public void emptySpaceAfterLastWordTest(){
        LengthOfLastWord test = new LengthOfLastWord();
        int length = test.lengthOfLastWord("   fly me   to   the moon  ");

        Assertions.assertEquals(4, length,"Length is not expected. Length is " + length);

    }

    @Test
    public void symbolAfterLastWordTest(){
        LengthOfLastWord test = new LengthOfLastWord();
        int length = test.lengthOfLastWord("Hello world$%");

        Assertions.assertEquals(7, length, "Length is not expected. Length is " + length);
    }
}

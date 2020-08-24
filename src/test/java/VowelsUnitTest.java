import org.testng.Assert;
import org.testng.annotations.Test;

public class VowelsUnitTest {

    // The input string will only consist of lower case letters and/or spaces.

    @Test
    public void testOnlyVowels() {
        Assert.assertEquals(Vowels.countVowels("aoieu"),
                5, "False, there are 5 vowels!");
    }

    @Test
    public void testOnlyLetters() {
        Assert.assertEquals(Vowels.countVowels("helloworld"),
                3, "False, there are 3 vowels!");
    }

    @Test
    public void testLettersAndSpaces() {
        Assert.assertEquals(Vowels.countVowels(" h e l l o    w o r l d "),
                3, "False, there are 3 vowels!");
    }

    @Test
    public void testNull() {
        Assert.assertEquals(Vowels.countVowels(""),
                0, "False, there are 0 vowels!");
    }
}

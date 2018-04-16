package problems;
import org.testng.*;
public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        //Palindrome.checkPalindrome("LEVEL");
        Assert.assertEquals("LEVEL",Palindrome.checkPalindrome("LEVEL"));
        //Assert.assertEquals("ARMY",Anagram.main());
    }
}

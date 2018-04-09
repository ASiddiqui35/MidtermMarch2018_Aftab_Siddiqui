package problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Palindrome.checkPalindrome("FALAFAL");
    }
    public static String checkPalindrome(String original){
        String reversed = "";
        StringBuffer sb = new StringBuffer(original);
         reversed =sb.reverse().toString();

    if (reversed.equals(original)) {
        System.out.println("This word is a Palindrome");
    }else {
        System.out.println("This word is not a Plindrome");
    }
    return reversed ;
}



}

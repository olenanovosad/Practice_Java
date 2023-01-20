package meeting;

import java.util.Arrays;

public class SameLetters {
    /*
    Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

     */
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abb";

        System.out.println(sameLetters(str1, str2));
    }

    public static boolean sameLetters(String str1, String str2) {


      char [] first = str1.toCharArray();
      char [] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first,second);
    }
}

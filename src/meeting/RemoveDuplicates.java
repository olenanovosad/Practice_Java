package meeting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC

     */
    public static void main(String[] args) {
        String str = "AABBBCCC";
        System.out.println(removeDup(str));

    }

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }
        return result;
    }

}

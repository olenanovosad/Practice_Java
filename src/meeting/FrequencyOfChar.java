package meeting;

public class FrequencyOfChar {
    /*
    Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */


    public static void main(String[] args) {
        String str = "AABBCDD";
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == each) {
                    count++;
                }

            }
            if (!result.contains("" + each)) {
                result += each + "" + count;
            }

        }
        System.out.println("result = " + result);

    }


}

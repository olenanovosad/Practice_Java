package replit;

public class BiggestWord {
    public static void main(String[] args) {
        String [] words = {"aaa", "bbbbb", "whasstupppp"};

    String max = words [0];

        for (String each : words) {
            if (each.length()>max.length()){
                max=each;

            }
        }
        System.out.println("max = " + max);

    }
}

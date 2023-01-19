package replit;

public class CountAppearance {
    public static void main(String[] args) {


        String[] arr = {"a", "foo", "bar", "foo", "bla"};
        String word = "foo";
       int count=0;

        for (String each : arr) {
            if (each.equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}

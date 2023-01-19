package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TimesTwo {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,5,5));
        System.out.println(timesTwo(nums));
    }

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        // TODO: finish the method
ArrayList<Integer> timesTwo=new ArrayList<>();
        for (Integer each : nums) {
            int mult = each*2;
            timesTwo.add(mult);
        }


return timesTwo;

    }
}

package replit;

public class CountDup {
    public static void main(String[] args) {
        String [] arr= {"1","2","aa" ,"1"};
        System.out.println(getDup(arr));
    }
    public static int getDup(String[] arr) {
int dup=0;
        for (String each : arr) {
            int count =0;
            for (String other : arr) {
                if(each.equals(other)){
                    count++;
                }
            }
        if(count>1){
            dup+=count;
        }
        }

return dup;




    }

}

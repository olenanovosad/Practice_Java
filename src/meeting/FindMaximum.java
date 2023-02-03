package meeting;

public class FindMaximum {
    public static void main(String[] args) {
       int[] num = {1,24,67,89,90,180};

       int max =num[0];

       for(int i =0;i<num.length;i++){
           if(num[i]>max){
               max=num[i];
           }
       }

        System.out.println("max = " + max);
    }
}

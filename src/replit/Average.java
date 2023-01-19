package replit;

public class Average {
    public static void main(String[] args) {
        double [] temp = {45.7,78,89.7};

        double average= 0;
        double sum=0;
        int count = 0;

        for (double v : temp) {
            sum+=v;
            count++;
        }
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);

        average= sum/count;
        System.out.println("average = " + average);
    }
}

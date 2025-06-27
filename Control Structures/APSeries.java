import java.util.*;

class APSeries {
    public static void main(String[] args) {
        int start,end,val,count=0,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Starting Range : ");
        start = scan.nextInt();
        System.out.println("Enter Ending Range : ");
        end = scan.nextInt();
        System.out.println("Enter Value : ");
        val = scan.nextInt();
        while(count < end) {
            sum += start;
            start += val;
            count++;
        }
        System.out.println(sum);
    }
}
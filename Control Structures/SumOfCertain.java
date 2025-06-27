import java.util.*;

class SumOfCertain {
    public static void main(String[] args) {
        int start,end,sum=0,num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Starting Range : ");
        start = scan.nextInt();
        System.out.println("Enter Ending Range : ");
        end = scan.nextInt();
        System.out.println("Enter Value : ");
        num = scan.nextInt();
        for(int i=start;i<=end;i++) {
            if(i%num==0) {
                sum += i;
            }
        }
        System.out.println("Result : "+sum);
    }
}
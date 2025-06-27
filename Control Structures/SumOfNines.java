import java.util.*;

class SumOfNines {
    public static void main(String[] args) {
        int val;
        int sum = 0,total = 0;
        int count = 0,i = 9;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Range : ");
        val = scan.nextInt();
        while(count < val) {
            sum += i;
            i *= 10;
            System.out.println(sum);
            count++;
            total += sum;
        }
        System.out.println(total);
    }
}
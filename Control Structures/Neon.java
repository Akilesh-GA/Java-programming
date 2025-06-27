import java.util.*;

class Neon {
    public static void main(String[] args) {
        int num,exp,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        num = scan.nextInt();
        exp = num * num;
        while(exp != 0) {
            sum += (exp % 10);
            exp/=10;
        }
        if(sum == num) {
            System.out.println("Neon Number");
        }
        else {
            System.out.println("Not A Neon Number");
        }
    } 
}
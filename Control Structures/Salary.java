import java.util.*;

class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Days : ");
        int days = scan.nextInt();
        int sal = 10,sum=0; 
        for(int i=1;i<=days;i++) {
            sum += sal;
            sal *= 2;
        }
        System.out.println("Result : "+sum);
    }
}
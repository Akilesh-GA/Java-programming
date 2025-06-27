import java.util.*;

class Series {
    public static int Factorial(int num) {
        int fact = 1;
        for(int i=num;i>=1;i--) {
          fact *= i;
        }
        return fact;
    }
    public static void main(String[] main) {
        int num;
        double sum = 0.0d;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for(int i=1;i<=num;i++) {
            sum += (double) i / (double) Factorial(i);
        }
        System.out.println("Sum : "+sum);
    }
}
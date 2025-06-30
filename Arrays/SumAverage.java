import java.util.*;

class SumAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter Size : ");
        size = scan.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        float average = 0.0f;
        System.out.print("Enter "+ size +" Values : ");
        for(int i=0;i<size;i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum : "+(sum));
        System.out.println("Average : "+(sum/size));
    }
}
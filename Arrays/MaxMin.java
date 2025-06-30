import java.util.*;

class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        int maxVal = 0;
        int minVal = 0;
        System.out.print("Enter Size : ");
        size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter "+ size +" Values : ");
        for(int i=0;i<size;i++) {
            arr[i] = scan.nextInt();
        }
        minVal = arr[0];
        maxVal = arr[0];
        for(int i=0;i<size;i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if(arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        System.out.println("Maximum Element : "+(maxVal));
        System.out.println("Minimum Element : "+(minVal));
    }
}
import java.util.*;

class LargestSmallestValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter Size : ");
        size = scan.nextInt();
        System.out.print("Enter " + size + " Values : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        if(size == 1) {
            System.out.println("Largest and Smallest Value is : ");
            System.out.println(arr[0]);
        }
        else if(size == 2 || size == 3) {
            System.out.println("Largest and Smallest Values are : ");
            System.out.println(arr[size-1]);
            System.out.println(arr[0]);
        }
        else if(size >= 4) {
            System.out.println("Top 2 Smallest and Top 2 Largest Values are : ");
            System.out.println(arr[0] + " " + arr[1]);
            System.out.println(arr[size-1] + " " + arr[size-2]);
        }
        else {
            System.out.println("Enter Valid Size > 0 ");
        }
    }
}
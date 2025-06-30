import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter Size : ");
        size = scan.nextInt();
        System.out.print("Enter " + size +" Values : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int index = 0;
        for(int i=0;i<size-1;i++) {
            if(arr[i] == arr[i+1]) {
                continue;
            }
            else {
                arr[index++] = arr[i];
            }
        }
        for(int i=0;i<index;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[size-1]);
    }
}
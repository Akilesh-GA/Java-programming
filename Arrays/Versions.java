import java.util.*;

class Versions {
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
        int zeros = 0;
        int nonZeros = 0;
        for(int i=0;i<size;i++) {
            if(arr[i] == 10) {
                arr[i] = 0;
            }
            if(arr[i] == 0) {
                zeros++;
            }
            else {
                nonZeros++;
            }
        }
        int zeroIndex = 0;
        int nonZeroIndex = 0;
        int[] zeroArr = new int[zeros];
        int[] nonZeroArr = new int[nonZeros];
        for(int i=0;i<size;i++) {
            if(arr[i] == 0) {
                zeroArr[zeroIndex++] = arr[i];
            }
            else {
                nonZeroArr[nonZeroIndex++] = arr[i];
            }
        }
        for(int i=0;i<nonZeroIndex;i++) {
            System.out.print(nonZeroArr[i] + " ");
        }
        for(int i=0;i<zeroIndex;i++) {
            System.out.print(zeroArr[i] + " ");
        }
    }
}
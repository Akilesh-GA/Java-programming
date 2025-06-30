import java.util.*;

class AsciiToChar {
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
        for(int i=0;i<size;i++) {
            System.out.println((char)arr[i]);
        }
    }
}
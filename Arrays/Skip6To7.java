import java.util.*;

class Skip6To7 {
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
        int sixIndex = 0;
        int sevenIndex = 0;
        for(int i=0;i<size;i++) {
            if(arr[i] == 6) {
                sixIndex = i;
            }
            if(arr[i] == 7) {
                sevenIndex = i;
            }
        }
        int sum = 0;
        // System.out.println("6 present in index : " + sixIndex);
        // System.out.println("7 present in index : " + sevenIndex);
        int i = 0;
        if(sixIndex < sevenIndex) {
            for(int j=0;j<size;j++) {
                if(j < sixIndex || j > sevenIndex) {
                    sum += arr[j++];
                }
            }
        }
        else {
            while(i < size) {
                sum += arr[i++];
            }
        }
        System.out.print("Result : "+ (sum));
    }
}
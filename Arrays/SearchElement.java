import java.util.*;

class SearchElement {
    public static int binarySearch(int left,int right,int[] arr,int target) {
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] > target) {
                return binarySearch(left,mid-1,arr,target);
            }
            else {
                return binarySearch(mid+1,right,arr,target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        int target = 0;
        System.out.print("Enter Size : ");
        size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter "+ size +" Values : ");
        for(int i=0;i<size;i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter Target Element : ");
        target = scan.nextInt();
        Arrays.sort(arr);
        int left = 0;
        int right = size-1;
        int res = binarySearch(left,right,arr,target);
        if(res == -1) {
            System.out.print(target + " Not Found !");
        }
        else {
            System.out.print(target + " Found at index " + res);
        }
    }
}
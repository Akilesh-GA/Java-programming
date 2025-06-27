import java.util.*;

class Duplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = scan.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter " + size + " Values : ");
        for(int i=0;i<size;i++) {
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);
        for(int i=0;i<size-1;i++) {
            if(nums[i] == nums[i+1]) {
                continue;
            }
            else {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.print(nums[size-1]);
    } 
}
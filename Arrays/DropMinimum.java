import java.util.*;

class DropMinimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = scan.nextInt();
        System.out.print("Enter " + size + " Elements : ");
        int[] nums = new int[size];
        for(int i=0;i<size;i++) {
            nums[i] = scan.nextInt();
        }
        int min = nums[0];
        for(int i=0;i<size;i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        for(int i=0;i<size;i++) {
            if(nums[i] == min)
                continue;
            System.out.print(nums[i] + " ");
        }
    }
}
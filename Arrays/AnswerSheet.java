import java.util.*;

class AnswerSheet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = scan.nextInt();
        System.out.print("Enter " + size + " Elements : ");
        int[] nums = new int[size];
        for(int i=0;i<size;i++) {
            nums[i] = scan.nextInt();
        }
        for(int i=0;i<size;i++) {
            if(nums[i] != 0 || nums[i] != 1) {
                System.out.print("Invlid Input !");
                return;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<size;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
import java.util.*;

class SumOrProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = scan.nextInt();

        System.out.print("Enter " + size + " Elements : ");
        int sum = 0,prod = 1;
        int[] nums = new int[size];
        for(int i=0;i<size;i++) {
            nums[i] = scan.nextInt();
            prod *= nums[i];
            sum += nums[i];
        }
        if(sum % 2 == 0) {
            System.out.print("Sum of Array : " + sum);
        }
        else {
            System.out.print("Product of Array : " + prod);
        }
    }
}
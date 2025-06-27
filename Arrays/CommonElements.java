import java.util.*;

class CommonElements {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int size1,size2;

        System.out.print("Enter Size 1 : ");
        size1 = scan.nextInt();
        
        System.out.print("Enter "+ size1 + " Elements : ");
        int[] nums1 = new int[size1];
        for(int i=0;i<size1;i++) {
            nums1[i] = scan.nextInt();
        }
        
        System.out.print("Enter Size 2 : ");
        size2 = scan.nextInt();
        
        System.out.print("Enter "+ size2 + " Elements : ");
        int[] nums2 = new int[size2];
        for(int i=0;i<size2;i++) {
            nums2[i] = scan.nextInt();
        }

        boolean common = false;
        for(int i=0;i<size1;i++) {
            for(int j=0;j<size2;j++) {
                if(nums1[i] == nums2[j]) {
                    common = true;
                }
            }
        }

        if(common) {
            System.out.print("Array has Common Elements !");
        }
        else {
            System.out.print("Array has No Common Elements");
        }
    }
}
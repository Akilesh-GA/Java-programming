import java.util.*;

class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = scan.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter " + size + " Elements : ");
        for(int i=0;i<size;i++) {
            nums[i] = scan.nextInt();
        }
        
        Arrays.sort(nums);
        
        int count = size;
        for(int i=0;i<size-1;i++) {
            if(nums[i] == nums[i+1]) {
                count--;
            }
        }

        int freqSize = count;
        int[] freq = new int[freqSize];
        int index = 0;
        
        for(int i=0;i<size;){
            int freqCount = 0;
            int curr = nums[i];
            while(i<size && curr == nums[i]) {
                i++;
                freqCount++;
            }
            freq[index++] = freqCount;
        }

        for(int i=0;i<freqSize;i++) {
            System.out.print(freq[i] + " ");
        }
    }
} 
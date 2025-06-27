import java.util.*;

class OddNumbers {
    public static void main(String[] args) {
        int val;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        val = scan.nextInt();
        System.out.println("Odd Numbers : ");
        for(int i=1;i<=val;i+=2) {
            System.out.println(i);
        }
    }
}
import java.util.*;

class TrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Range : ");
        int rows = scan.nextInt();
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=rows;j++) {
                if((i+j) <= rows) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
}
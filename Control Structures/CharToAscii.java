import java.util.*;
import java.lang.*;

class CharToAscii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Character : ");
        char val = scan.next().charAt(0);
        System.out.println((int)val);
    }
}
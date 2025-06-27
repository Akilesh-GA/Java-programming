import java.util.*;

class LeapYear {
    public static void main(String[] main) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = scan.nextInt();
        if(year < 0) {
            System.out.println("Invalid Year");
        }
        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
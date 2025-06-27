import java.util.*;

class ProfitOrLoss {
    public static void main(String[] main) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Buying Price : ");
        float buyingPrice = scan.nextFloat();
        System.out.println("Enter Selling Price : ");
        float sellingPrice = scan.nextFloat();
        if(buyingPrice < 0.0f || sellingPrice < 0.0f) {
            System.out.println("Invalid Amount");
        }
        if(sellingPrice >=  buyingPrice) {
            System.out.println("Profit Amount : "+(sellingPrice - buyingPrice));
        }
        else {
            System.out.println("Loss Amount : "+(buyingPrice - sellingPrice));
        }
    }
}
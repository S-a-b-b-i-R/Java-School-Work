
import java.util.Scanner;

public class SalesTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sales cs = new Sales();

        int productNo, quantity;

        do{
            productNo = requestInput("Enter product number 1-5 (-1 to quit): ", sc);

            // verify product no is in range
            if((productNo != -1) && !(productNo > 5)){
                quantity = requestInput("Enter quantity for product " + productNo + ": ", sc);
                cs.addProduct(productNo, quantity);
            }

        }while((productNo != -1));

        System.out.printf("Total: %.2f\n", cs.getTotal());
    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}

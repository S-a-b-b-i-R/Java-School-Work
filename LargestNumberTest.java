//coded by Sabbir Ahmed_5035170112
import java.util.Scanner;

public class LargestNumberTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LargestNumber ln = new LargestNumber();

        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter a number: ", i+1);
            ln.enterNumber(sc.nextInt());
        }
        System.out.printf("The largest number is: %d\n", ln.getLargestNumber());
    }
}

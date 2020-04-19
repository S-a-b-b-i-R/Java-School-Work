import java.util.Scanner;

public class Chap2SeperatingDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] num = new int[2];

        System.out.print("Enter a 2 digit number: ");
        int x = input.nextInt();

        // countdown to ensure numbers don't get reversed
        for(int i=1; i>=0; --i){
            num[i] = x % 10;
            x /= 10;
        }

        for(int i : num){
            System.out.printf("%d   ", i);
        }
        System.out.println();
    }
}

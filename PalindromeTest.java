
import java.util.Scanner;

public class PalindromeTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Palindrome np = new Palindrome();

        while(true){
            System.out.print("Enter a 7 digit number to test: ");
            int testCase = sc.nextInt();

            if(np.validate(testCase)){
                if(np.isPalindrome(testCase))
                    System.out.printf("%s is a palindrone.\n", testCase);
                else
                    System.out.printf("%s is not a palindrone.\n", testCase);
                break;
            }
        }
    }
}

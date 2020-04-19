import java.util.Scanner;

public class Chapter2_Divisible {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[3];
        int x = input.nextInt();

        for (int i=0; i<2; i++) {
            if (num[i]%3==0 && num[i]%5==0) {
                System.out.print(num[i] + ", ");
            }
        }
        System.out.println("\n");
    }
}

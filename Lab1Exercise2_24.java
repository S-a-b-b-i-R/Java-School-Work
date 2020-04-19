
import java.util.Scanner;

public class Lab1Exercise2_24{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 space separated integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        // calculate highest
        System.out.printf("Highest: %d\n",
                Math.max(a, Math.max(b, (Math.max(c, Math.max(d, e))))));

        // calculate lowest
        System.out.printf("Lowest: %d\n",
                Math.min(a, Math.min(b, (Math.min(c, Math.min(d, e))))));
    }
}

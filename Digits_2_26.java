// Coded by Sabbir Ahmed %035170112
import java.util.Scanner;

public class Digits_2_26 {



        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter two space separated integers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.printf("%d is%sa multiple of %d\n", x, (x % y == 0 ? " " : " not "), y);
        }
    }



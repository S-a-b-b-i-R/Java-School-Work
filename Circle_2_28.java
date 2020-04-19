
import java.util.Scanner;

public class Circle_2_28 {




        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int r;

            System.out.print("Enter a circle's radius: ");
            r = input.nextInt();

            System.out.printf("Diameter = %d\nCircumference = %.2f\nArea = %.2f\n",
                    2 * r, 2 * Math.PI * r, Math.PI * r * r);
        }
    }



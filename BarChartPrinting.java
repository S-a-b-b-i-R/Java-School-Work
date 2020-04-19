import java.util.Scanner;

public class BarChartPrinting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] values = new int[5];
        int count = 0;

        // get input
        for(int i=0; i<5; i++){
            values[i] = requestInput("Enter number " + ++count + ": ", sc);
        }

        count = 0;
        // print values
        for(int i=0; i<5; i++){
            System.out.printf("%d:  ", ++count);
            for(int j=0; j<values[i]; j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}

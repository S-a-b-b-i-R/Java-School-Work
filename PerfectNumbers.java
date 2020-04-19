/* coded by Sabbir Ahmed 503517012*/
public class PerfectNumbers{
    public static void main(String[] args){

        for(int i=0; i<1000000; i++){
            if(isPerfect(i)){
                System.out.printf("%d: ", i);
                printFactors(i);
            }
        }
    }
    // check if the temp value composed of perfect divisors is equal to the
    // original number
    public static boolean isPerfect(int number){
        int temp = 0;
        for(int i=1; i<=number/2; i++){
            if(number % i == 0)
                temp +=i;
        }
        return (temp == number) ? true : false;
    }
    // loop and return perfect divisors (factors)
    public static void printFactors(int number){
        for(int i=1; i<=number; i++){
            if(number % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

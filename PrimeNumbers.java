/* coded by Sabbir Ahmed 503517012*/
public class PrimeNumbers{
    public static void main(String[] args){
        int count = 0;
        for(int i=2; i<10000; i++){
            if(isPrime(i)){
                System.out.printf("%d, ", i);
                count++;
            }
            // output formatting
            if(count == 10){
                count = 0;
                System.out.println();
            }
        }
        System.out.println();
    }
    // only need to check those numbers not divisible by 2
    // if number is divible by any number > 1 then is not prime.
    public static boolean isPrime(int n){
        for(int i=2; 2*i<n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}


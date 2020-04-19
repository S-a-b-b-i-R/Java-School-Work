/* coded by Sabbir Ahmed 5035170112*/
import java.util.*;
public class SumArray
{
    public static void main(String[] args )
    {
        int N,k,sum=0,max,min;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array lenght :");
        N=sc.nextInt();
        int []arr=new int[N];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<N; i++)
        {
            k=sc.nextInt();
            arr[i]=k;
        }
        min=arr[0];
        max=arr[0];
        for(int i=0; i<N; i++)
        {
            if (max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
            sum=sum+arr[i];
        }
        avg=(float)sum/N;
        System.out.println("The average is: "+avg);
        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
        System.out.print("array element left to right: ");
        for(int i=0; i<N; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.print("array element right to left: ");
        for(int i=N-1; i>=0; i--)
            System.out.print(arr[i]+" ");

    }
}


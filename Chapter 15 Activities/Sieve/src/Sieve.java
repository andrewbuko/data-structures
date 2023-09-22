import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        in.close();
        Set<Integer> numbers = new HashSet<>();
        for (int i = 2; i <=n;i++)
        { 
            numbers.add(i);
        }
        int end = (int)(Math.pow(n,0.5));
        for(int i = 2; i <= end; i++)
        {
            Iterator<Integer> iterator = numbers.iterator();
            while(iterator.hasNext())
            {
                int num = iterator.next();
                if(num%i == 0 && num!=i)
                {
                   iterator.remove();
                }
            }
        }
        System.out.println(numbers);
        // Your work goes here
        







    }
}

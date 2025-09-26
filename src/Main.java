import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's a prime number: ");
        n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number!");
        } else {
            System.out.println(n + " is not a prime number");
        }

        ArrayList<Integer> primeNums = new ArrayList<>();

        for (int i = 1; i <= 100; i++)
        {
            if(isPrime(n))
            {
                primeNums.add(i);
            }
        }

        System.out.println("Here's a list of all prime nums between 1 and 100: \n" + primeNums);
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }

        for (int i =2; i<= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
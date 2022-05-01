package Java110Lab;
public class Lab5Tester
{
    public static void main(String [] args)
    {
        for (int i = 2; i < 20; i++)
            if (isPrime(i))
                System.out.println(i);
    }
    /**
     Method isPrime determines if a given integer is a prime number
     @param n integer to test
     @return true if number is prime, false otherwise
     */
    public static boolean isPrime(int n)
    {
        for (int i = 2; i <= n/2;i++)
            if (n%i==0)
                return false;
        return true;

    }
}

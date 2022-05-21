public class Recursion
{
    public static void main(String[] args)
    {
        Recursion recursion = new Recursion();
        System.out.println("Sum: " + recursion.sum(2));
        System.out.println("Factorial: " + recursion.factorial(4));
        System.out.println("Power: " + recursion.powerOfN(2,3));
        System.out.println("BunnyEars: " + recursion.bunnyEars(10));
    }

    int sum(int number)
    {
        if(number >= 1)
        {
            return number + sum(number - 1);
        }
        return number;
    }


    int factorial(int number)
    {
        if(number >= 1)
        {
            return number * sum(number - 1);
        }
        return number;
    }


    int powerOfN(int number, int power)
    {
        if(power >= 1)
        {
            return number + powerOfN(number , power - 1);
        }
        return number;
    }

    int bunnyEars(int number)
    {
        if(number >= 1)
        {
            return 2 +  bunnyEars(number - 1);
        }

        return number;
    }
}

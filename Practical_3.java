/*Given two non-negative int values, return true if
they have the same last digit, such as with 27 and 57.
 Note that the % "mod" operator computes remainders,
 so 17 % 10 is 7.
 lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true*/
//21CE124-Aary Shah
import java.util.Scanner;
public class Practical_3
{
    public static void main(String[] args)
    {
        int c=0;
        int d=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lastdigit(a,b));
        System.out.println("21CE124-Aary Shah");
    }
    public static boolean lastdigit(int a,int b)
    {
        int c,d;
        c = a % 10;
        d = b % 10;
        return c==d;
    }
}

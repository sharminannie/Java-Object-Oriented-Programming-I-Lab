import java.util.Scanner;
public class Lcm{
public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a,b;
                System.out.println("Enter two value");
		a = scan.nextInt();
		b = scan.nextInt();

                While(a%b!=0)
               {
                 int remainder=a%b;
                  a=b;
                 b=remainder;
                }

		int gcd=b;
		int lcm = (a*b)/gcd;
		System.out.println("Lcm=%d",Lcm);
       }
 }
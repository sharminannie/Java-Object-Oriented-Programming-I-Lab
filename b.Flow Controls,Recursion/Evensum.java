import java.util.Scanner;
    public class Evensum
 {
         public static void main(String[] args)
      {
             Scanner scan=new Scanner(System.in);
             int N,D,sum=0;
             System.out.printf("Enter a number:");
             N=scan.nextInt();
	     while(N>0)
	     {
		D=N%10;
		if(D%2==0)
                   {
                      sum+=D; 
                   }
		N=N/10;
	     }
          System.out.print(sum);
      }
 }
import java.util.Scanner;
    public class Fibonacci
{
         public static void main(String[] args)
     {
            Scanner scan=new Scanner(System.in);
            int i,N,first=0,second=1,result;
	    System.out.println("Enter a value N:");
            N=scan.nextInt();
	    for(i=1;i<=N;i++)
            {
		if(i<=1) 
                    {
                       result=i;
                    }
              else
                    {  
                      result=first+second;
                      first=second;
                      second=result;
	            }
             System.out.println("%d ",result);

            }


     }
}
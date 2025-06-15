import java.util.Scanner;
    public class Factorial{
	  static int fact(int N)
           { 
            if(N==0)
              {
               return 1;
              }
             else
                  {
                    return N*fact(N-1);
                  }
            }
           
           public static void main(String[] args){
               Scanner scan=new Scanner(System.in);
           int N,result;
	   System.out.printf("Enter a number:");
           N=scan.nextInt();   
	   result=fact(N);
           System.out.println(result);
	}

}
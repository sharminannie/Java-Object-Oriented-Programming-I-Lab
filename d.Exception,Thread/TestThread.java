import java.util.Scanner;

public class TestThread 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int EvenMax=scan.nextInt();	
		int EvenMin=scan.nextInt();	
		int OddMax=scan.nextInt();	
		int OddMin=scan.nextInt();	
				
	    Thread Even=new Thread(new Job(EvenMax,EvenMin,true));
		Thread Odd=new Thread(new Job(OddMax,OddMin,false));
		Even.start();
		Odd.start();
	}

}

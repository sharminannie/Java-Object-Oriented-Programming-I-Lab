import java.util.Scanner;
public class MaxMin
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
                int N,i,max,min;
		System.out.println(" Enter array size:");
		N = scan.nextInt();
		int a[] = new int[N];
		for(i=0;i<N;i++)
		{
			a[i] = scan.nextInt();
		}
		max = a[0];
		min = a[0];
		for( i=0;i<N;i++)
		{
			if(a[i]>max) 
                              max = a[i];
			if(a[i]<min) 
                              min = a[i];
		}
		System.out.printf("Max:%d\n",max);
		System.out.printf("Min:%d",min);
	}
}
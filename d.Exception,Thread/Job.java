
public class Job implements Runnable
{
	int max;
	int min;
	boolean isEven;
	public Job(int max,int min,boolean isEven)
	{
		this.max=max;
		this.min=min;
		this.isEven=isEven;
		
	}
	@Override
	
    public void run()
    {
		int i; 
		for(i=min;i<=max;i++)
		{
			if ((i % 2 == 0 && isEven==true) || (i % 2 != 0 && isEven==false))
			{
				System.out.println(Thread.currentThread().getName()+":" +i);
			}
			
		}
    }
}

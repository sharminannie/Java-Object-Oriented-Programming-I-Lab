import java.util.Scanner;

public class TestException
{
	
	public static void main(String [] args)
		{
			Scanner scan = new Scanner(System.in);
			int i;
			for(i=0;i<=10;i++)
			{
				float Attendance=scan.nextFloat();
				boolean hasAttend=scan.nextBoolean();
				try
				{
				checkDataForStudent(Attendance,hasAttend);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			
		}
		
		
		public static void checkDataForStudent(float Attendance, boolean hasAttend) throws Exception
		{
			
			if(Attendance<70)
			{
				throw new Exception("Attendance should be 70 or more to be eligible for the final exam");
			}
			 if(!hasAttend)
			{
				System.out.println("Failed");
			}
			else
			{
				System.out.println("Eligible for Final Exam");
			}
		}
		
	}

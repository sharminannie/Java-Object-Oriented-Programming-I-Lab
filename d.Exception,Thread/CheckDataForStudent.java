import java.util.Scanner;

public class CheckDataForStudent 
{
		
		public static void main(String [] args)
			{
				Scanner scan = new Scanner(System.in);
				int i;
				for(i=0;i<=10;i++)
				{
					System.out.println("Enter Attendance");
					float Attendance=scan.nextFloat();
					System.out.println("Enter Attended the final xm or not");
					boolean hasAttend=scan.nextBoolean();
					try
					{
					checkDataForStudent(Attendance,hasAttend);
					}
					catch(LowAttendanceException e)
					{
						System.out.println(e.getMessage());
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				}
				
				
			}
			
			
			public static void checkDataForStudent(float Attendance, boolean hasAttend) throws LowAttendanceException,Exception
			{
				
				if(Attendance<70)
				{
					throw new LowAttendanceException(70);
				}
				 if(!hasAttend)
				{
					throw new Exception("Failed due to absence in Final exam");
				}
				else
				{
					System.out.println("Eligible for Final Exam");
				}
			}
			
		}

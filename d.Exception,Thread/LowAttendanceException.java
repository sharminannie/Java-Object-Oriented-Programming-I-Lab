

  public class LowAttendanceException extends Exception 
	{
		public  LowAttendanceException(float minAttendance)
		{
			super ("Attendance percentage should be "+ minAttendance + " or more to sit for the final exam");
		}

	}

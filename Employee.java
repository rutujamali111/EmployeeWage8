
public class Employee {
	int NUM_OF_WORKING_DAYS = 0;
	final int IS_PART_TIME = 1;
	final int IS_FULL_TIME=2;
	int EMP_RATE_PER_HOUR=20;
	public void Presenty()
	{
		
		double empCheck=(Math.random()*10)%3;
		if(empCheck==IS_FULL_TIME)
			System.out.println("Employee is present..");
		else
			System.out.println("Employee is Absent");
	}
	
	public int DailyEmployeeWage()
	{
		int empHrs=0;
		int empWage=0;
		
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		
			switch(empCheck)
			{
				case IS_PART_TIME:
					empHrs=4;
					break;
				case IS_FULL_TIME:
					empHrs=8;
					break;
				default:
					empHrs=0;
			}
			empWage=empHrs*EMP_RATE_PER_HOUR;
			
		return empWage;
	
	}
	public int TotalEmpWage()
	{
		int totalEmpWage=0;
		for(int day=0;day<NUM_OF_WORKING_DAYS;day++)
		{
			totalEmpWage+=DailyEmployeeWage();
		}
		
		return totalEmpWage;
	}
}

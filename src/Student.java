public class Student extends User{
	String first,middle,last;;
	String Username;
	String Password;
	boolean payment;
	CourseList Schedule; 
	/*The Schedule should essentially use the 
	 * same Courses as the main list but it 
	 * has to be its own separate list
	 */
	public Student(String Username, String Password, String first, String middle, String last)
	{
		this.Username = Username; 
		this.Password = Password; 
		this.first = first; 
		this.middle = middle; 
		this.last = last;
	
		this.addCreds(Username, Password);
		FinancialOffice.addToFinance(Username);
		
	}
	public void payBill()
	{
		FinancialOffice.payFee(this.Username);
	}
	public boolean isPaid()
	{
		return FinancialOffice.isPaid(this.Username);
	}
	//void accessCourseList() 
	//{
	//	return CourseList;	
	//}
	//adding a course to the schedule
	//public void addCourse()
	//{
	//Schedule.addCourse();	
	//}
	//deleting a course from the schedule
	//public void remCourse(){
	//	Schedule.deleteCourse(ID);
	//}
	//accessing and printing the schedule
	//void printSchedule(){
	//	return Schedule;
	//}
}

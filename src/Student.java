
public class Student extends User{
	String first,middle,last;
	String Username;
	String Password;
	boolean payment = false;
	CourseList Schedule; 
	/*The Schedule should essentially use the 
	 * same Courses as the main list but it 
	 * has to be its own separate list
	 */

	public Student(String Username, String Password, String first, String middle, String last){
		this.Username = Username; this.Password = Password; this.first = first; this.middle = middle; this.last = last; 
		
	}
	
	void accessCourseList(int ID) {
//		for()
		// TODO Auto-generated method stub
		
	}//getting the complete Course List

	public void addToSchedule(){
	
		
	}//adding a course to the schedule

	public void deleteFromSchedule(){
		
	}//deleting a course from the schedule
	
	void printSchedule(){
		
	}//accessing and printing the schedule 
	public void isPaid(Boolean payment){
		this.payment = payment;
	}//Ask for payment
	
	public String getUsername(String Username){
		return this.Username = Username;
	}//sets the User's Name
	
	public String setPassword(String Password){
		return this.Password = Password;
	}//sets the User's Password

	@Override
	void accessCourseList() {
		// TODO Auto-generated method stub
		
	}
}


public class Staff extends User{
	String first,middle,last;
	String Username;
	String Password;
	CourseList Courses;
	String name;
	
	public Staff(String Username, String Password, String first, String middle, String last){
		this.Username = Username;
		this.Password = Password; 
		this.first = first; 
		this.middle = middle; 
		this.last = last;
		
		this.addCreds(Username, Password);
	}
	//void accessCourseList() {
		//}

	//public void addCourse() {
		
	//}

	//public void setDescription(Course C){
		
	//}
	
	//public void deleteCourse() {
		// TODO Auto-generated method stub
		
	//}
	
}

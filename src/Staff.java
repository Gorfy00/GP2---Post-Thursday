
public class Staff extends User{
	String first,middle,last;
	String Username;
	String Password;
	CourseList Courses;
	String name;
	
	public Staff(String Username, String Password, String first, String middle, String last){
		this.Username = Username; this.Password = Password; this.first = first; this.middle = middle; this.last = last;
	}

	@Override
	public void accessCourseList() {
		
	}

	public void addCourse(String Title) {
		accessCourseList();
	}

	public void setDescription(Course C){
		C = new Course();
		//be able to enter the course's name 
	}
	
	public void deleteCourse() {
		// TODO Auto-generated method stub
		
	}
	
	public String getUsername(String Username){
		return this.Username = Username + ".edu";
	}//sets the User's name
	
	public String setPassword(String Password){
		return this.Password = Password;
	}//sets the User's Password
	
}

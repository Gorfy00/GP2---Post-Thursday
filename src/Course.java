import java.util.*;
public class Course {
	String Title;
	String Description;
	ArrayList<String> StudentList = new ArrayList<>();
	//List of Students
	
	public Course(){
		System.out.println("Please Enter Course");
	}//Asks the user to enter the title of the Course
	public Course(String Title){
		this.Title = Title;
	}//Instantiates the specific course

}

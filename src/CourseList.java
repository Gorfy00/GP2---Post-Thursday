import java.util.*;
public class CourseList {
	int CourseCount = 0;
	int CourseID;
	ArrayList<Course> Courses = new ArrayList<Course>();;
	
	public CourseList(){
	}
	
	public void addCourse(Course course){
		Courses.add(course);
		CourseID = CourseCount;
		CourseCount++;//Creates an ID for each course starting at 1
		/*Should probably print out the course 
		 * along with its ID before the add is 
		 * completed
		 */
	}
	public void deleteCourse(int ID){
		if(ID > 0 && ID < Courses.size()){
			Courses.remove(ID);
		}
		else{
			System.out.print("I'm sorry your ID is not valid");
		}
	}//Deletes course by ID
	
	public Course findCourse(int ID){
	if(ID > 0 && ID < Courses.size()){
		return Courses.get(ID);
	}
	else System.out.println("Your ID is not Valid");
		return null;
	//Searches for Course by its ID
	}
	
	public int getCourseID(){
		return CourseID;
	}

}

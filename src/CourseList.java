import java.util.*;
public class CourseList {
	int CourseID;

	ArrayList<Course> Courses = new ArrayList<Course>();
	
	public void addCourse(Course course){
		Courses.add(course);
		CourseID++;//Creates an ID for each course starting at 1
		/*Should probably print out the course 
		 * along with its ID before the add is 
		 * completed
		 */
	}
	public void deleteCourse(int ID){
	Courses.remove(ID);
	}//Deletes course by ID
	public Course findCourse(int ID){
	return Courses.get(ID);
			//Searches for Course by its ID
	}
}

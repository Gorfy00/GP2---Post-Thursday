
public class OURTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseList Schedule = new CourseList();
		Course SpanishOne = new Course("Spanish One");
		Course OldWorldH = new Course("Old World History");
		
		Schedule.addCourse(SpanishOne);
		Schedule.addCourse(OldWorldH);
		
		Schedule.findCourse(1);
		}
	}

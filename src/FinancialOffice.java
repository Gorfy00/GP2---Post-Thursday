/*Use an arrayList that contains all the courses added by Staff 
 */
import java.util.*;
public class FinancialOffice {

	ArrayList<Student> StudentList = new ArrayList<Student>();
	ArrayList<Student> PaidList = new ArrayList<Student>();

	public void addStudent(Student Students){
		StudentList.add(Students);
	}
	public void isPaid(Student Student){
		if(Student.payment == true){
			PaidList.add(Student);
		}
	}
}



public class OURTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student Kyle = new Student("rgn595", "pzoxic","Kyle", "Joseph", "Gould");
		Student Eddie = new Student("zrs992", "mko09ijn","Eddie", "Tidus", "Fulton");
		Staff Ward = new Staff("kxz867","zaq12wsx", "Micheal", "MNAME", "Ward");
		
		System.out.println(User.getCreds());
		System.out.println(User.getCreds().get("rgn595"));
		System.out.println(User.getCreds().get("kxz867"));
		System.out.println(User.getCreds().get("zrs992"));
		System.out.println(FinancialOffice.getPaidList());
		Kyle.payBill();
		System.out.println(FinancialOffice.getPaidList());
		System.out.println(Kyle.isPaid());
		System.out.println(Eddie.isPaid());
		
		System.out.println("Testing password reset function");
		System.out.println(User.getCreds().get("rgn595"));
		System.out.println(Kyle.resetPassword(Kyle.Username, "yourfailing"));
		System.out.println(User.getCreds());
		/*
		System.out.println("");
		
		Student JoStudent = new Student("Josho", "Password","Jo", "Mo", "Sho");
		System.out.println(JoStudent.Username);
		System.out.println(JoStudent.Password);
		System.out.println(JoStudent.first);
		System.out.println(JoStudent.middle);
		System.out.println(JoStudent.last);
	*/
	}

}

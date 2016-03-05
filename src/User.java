abstract class User {
	protected String first,middle,last;
	protected String Username;
	protected String Password;
	
	abstract void accessCourseList();
	//really need getUsername?
	abstract String getUsername(String Username);
	abstract String setPassword(String Password);
	
	
	public void creds(String Username, String Password){
		
	}
}

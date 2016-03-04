import java.util.*;

abstract class User {
	protected String first,middle,last;
	protected String Username;
	protected String Password;
	private static HashMap<String, String> credList = new HashMap<String, String>();
	
	//abstract void accessCourseList();
	
	public void addCreds(String key, String value){
		credList.put(key, value);
	}
	//remove this after testing
	public static HashMap<String, String> getCreds(){
		return credList;
	}
	public String resetPassword(String key, String newPassword)
	{
		String User = key;
		credList.remove(User);
		credList.put(key, newPassword);
		return "Your Password has been reset!";
	}
}

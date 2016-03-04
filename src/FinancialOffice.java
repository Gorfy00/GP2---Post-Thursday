/*Use an arrayList that contains all the courses added by Staff 
 */
import java.util.*;

public class FinancialOffice {

	private static HashMap<String, Integer> paidList = new HashMap<String, Integer>();
	
	public static void addToFinance(String key){
		paidList.put(key, 0);
	}
	public static void payFee(String key){
		paidList.put(key, paidList.get(key)+1);
	}
	public static boolean isPaid(String key){
		if (paidList.get(key) == 0){
		 return false;
		}
		else return true;
	}
	//TAKE THIS OUT ONLY FOR TESTING
	public static HashMap<String,Integer> getPaidList(){
		return paidList;
	}
}

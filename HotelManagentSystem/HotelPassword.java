package HotelManagentSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HotelPassword {
//	private static String saravanaBhavan = "sb";
//	private static String sriVenkateshwaraParadise = "svp";
//	private static String sivarajInn = "si";
//	private static String sriGupta = "sg";
//	private static String theParisCorner = "tpc";
//		 public boolean saravanaBhavanValid(String pass) {
//			 if(saravanaBhavan.equals(pass)) {
//				 return true;
//			 }
//			 return false;
//		 }
//		 public boolean sriVenkateshwaraParadiseValid(String pass) {
//			 if(sriVenkateshwaraParadise.equals(pass)) {
//				 return true;
//			 }
//			 return false;
//		 }
//		 public boolean sivarajInnValid(String pass) {
//			 if(sivarajInn.equals(pass)) {
//				 return true;
//			 }
//			 return false;
//		 }
//		 public boolean sriGuptaValid(String pass) {
//			 if(sriGupta.equals(pass)) {
//				 return true;
//			 }
//			 return false;
//		 }
//		 public boolean theParisCornerValid(String pass) {
//			 if(theParisCorner.equals(pass)) {
//				 return true;
//			 }
//			 return false;
//		 }
	
	static Map<Integer,String> pass = new HashMap<Integer, String>();
	
	public HotelPassword() {
		pass.put(1,"sb");
		pass.put(2,"svp");
		pass.put(3,"si");
		pass.put(4,"sg");
		pass.put(5,"tpc");
		
		
	}
	
	public static boolean hotelPassValidate(int id,String pass)
	{
		String p = HotelPassword.pass.get(id);
		System.out.println(p);
		if(p.equals(pass))
			return true;
		return false;
	}
	
	}
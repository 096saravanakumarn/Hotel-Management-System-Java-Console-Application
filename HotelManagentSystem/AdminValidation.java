package HotelManagentSystem;

public class AdminValidation {
	private static String u="Admin";
	private  static String p="1";
	public static boolean adminValidation(String u, String p) {
		if(AdminValidation.u.equalsIgnoreCase(u) && AdminValidation.p.equals(p)) {
			return true;
		}
		return false;
	}
}

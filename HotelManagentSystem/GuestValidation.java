package HotelManagentSystem;

public class GuestValidation {
	private static String u="Saravana";
	private static String p="123";
	public static boolean guestValidation(String u, String p) {
		if(GuestValidation.u.equalsIgnoreCase(u)) {
			return true;
		}
		return false;
	}
}

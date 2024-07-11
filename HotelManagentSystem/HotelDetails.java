package HotelManagentSystem;

import java.util.Arrays;

public class HotelDetails {
	String hotelName;
	int hotelId;
	boolean roomTypes;
	double price;
	int roomAvail = 10;
	boolean b[] = new boolean[10];
	
	HotelDetails(String hotelName,int hotelId,boolean b[],boolean roomTypes,double price) {
		this.hotelName = hotelName;
		this.hotelId = hotelId;
		this.b=b;
		this.roomTypes=roomTypes;
		this.price=price;
	}
}

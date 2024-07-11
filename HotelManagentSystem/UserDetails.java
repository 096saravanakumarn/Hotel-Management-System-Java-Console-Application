package HotelManagentSystem;

public class UserDetails {
	int hotelId;
	String name;
	String mobNo;
	String place;
	String reason;
	int room;
		UserDetails(int hotelId,String name,String mobNo,String place,String reason,int room){
			this.hotelId = hotelId;
			this.name = name;
			this.mobNo = mobNo;
			this.place = place;
			this.reason = reason;
			this.room = room;
		}
}

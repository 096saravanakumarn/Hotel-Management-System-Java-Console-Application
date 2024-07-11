package HotelManagentSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class HotelDB {
	static HashMap<Integer,HotelDetails> hm = new HashMap<Integer,HotelDetails>();
	static ArrayList<UserDetails> hd = new ArrayList<UserDetails>();
		HotelDB(){
			boolean b[] = {true,true,true,true,true,true,true,true,true,true};
			hm.put(1, new HotelDetails("Saravana Bhavan",1,b,true,700));
			hm.put(2, new HotelDetails("Sri Venkateshwara Paradise",2,b,false,400));
			hm.put(3, new HotelDetails("Sivaraj Inn",3,b,true,800));
			hm.put(4, new HotelDetails("Sri Gupta (A/C)",4,b,true,750));
			hm.put(5, new HotelDetails("The Paris Corner",5,b,false,350));
		}
		
		
		
}

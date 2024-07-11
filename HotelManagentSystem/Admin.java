package HotelManagentSystem;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Admin {
	
	static HashMap<Integer,HotelDetails> hm = HotelDB.hm;
	static ArrayList<UserDetails> hd =HotelDB.hd;
	
	public static void adminDashBoard(int id) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the User name: ");
		int user=sc.nextInt();
		sc.nextLine();
		HotelDetails acc = hm.get(user);
		if(acc==null) {
			System.out.println("No Hotel found !!!");
		}
		else {
			System.out.print("Enter the Password: ");	
			System.out.println();
			String password=sc.next();
			if(HotelPassword.hotelPassValidate(user,password) || id == user)
			{
				System.out.println("you are now Logged in to "+acc.hotelName);
				System.out.println("1. Guest Details\n2.Available Rooms");
				String str = sc.next();
				if(str.equalsIgnoreCase("1")) {
					for(int i=0;i<HotelDB.hd.size();i++) {
						System.out.println("    Room No: -->"+hd.get(i).room);
						System.out.println(hd.get(i).name);
						System.out.println(hd.get(i).mobNo);
						System.out.println(hd.get(i).place);
						System.out.println(hd.get(i).reason);
					}
				}
				else {
					System.out.println("There is no any user");
					
				}
			}
			else
			{
				HotelManagement.dis(user);
			}
		}
	}
}

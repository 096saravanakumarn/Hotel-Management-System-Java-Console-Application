package HotelManagentSystem;
import java.util.HashMap;
import java.util.Scanner;


public class HotelManagement {
	
	static void dis(int t){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Guest\n2.Admin");
		System.out.println("Press '1' if you are 'Guest'\tPress '2' if you are 'Admin'");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			Guest.guestDashBoard();
			break;
		case 2:
			Admin.adminDashBoard(t);
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelDB hdb = new HotelDB(); // For creating default Hotel details
		HotelPassword hp = new HotelPassword(); 
		Scanner sc=new Scanner(System.in);
		HotelManagement hss = new HotelManagement();
		hss.dis(0);
	}

	
}

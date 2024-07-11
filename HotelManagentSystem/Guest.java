package HotelManagentSystem;
import java.util.*;
import java.util.Map.Entry;

public class Guest {
	
	static HashMap<Integer, HotelDetails> hm = HotelDB.hm; //  Accessing the HotelDB
	static ArrayList<UserDetails> ud = HotelDB.hd;
	static int t=0;
	
	public static void guestDashBoard() {
		
		Scanner sc=new Scanner(System.in);
	int rNo=1;
			System.out.println("Select your Hotel");
			Dispaly();
			System.out.println("Select the hotel by Hotel ID");
			int hId = sc.nextInt();
		    final  HotelDetails selectedHotel = hm.get(hId);
			if(selectedHotel == null) {
				System.out.println("Invalid ID !!");
			}
			else {
				System.out.println("Hotel Name      : "+selectedHotel.hotelName);
				System.out.println("Hotel ID        : "+selectedHotel.hotelId);
				System.out.println("Room Type       : "+(selectedHotel.roomTypes==true? "AC":"Non-AC"));
				System.out.println("Price           : "+selectedHotel.price);
				boolean b[] = selectedHotel.b;
				System.out.print("Available Rooms   :");
				for(int i=0;i<b.length;i++)
				{
					if(b[i])
					{
						System.out.print((i+1)+"  ");
					}
				}
				System.out.println();
				System.out.println("Want to proceed? (Y/N)");
				String choice=sc.next();
				if(choice.equalsIgnoreCase("y"))
				{
					System.out.println("========================================");
					System.out.println("For Booking.....Enter the Guest Details: ");
					System.out.println("========================================");
					System.out.print("Available Rooms   :");
					for(int i=0;i<b.length;i++)
					{
						if(b[i])
						{
							System.out.print((i+1)+"  ");
						}
					}
					System.out.println();
					System.out.print("Room number you prefer:");
					rNo = sc.nextInt();
					sc.nextLine();
					System.out.print("Guest Name            : ");
					String name = sc.next();
					System.out.print("Guest Mobile No.      : ");
					String mob = sc.next();
					System.out.print("Guest Native          : ");
					String nat = sc.next();
					sc.nextLine();
					System.out.print("Reason for Booking    : ");
					String reason = sc.nextLine();
					System.out.println("Check weather your details are valid or not");
					System.out.println("Name      :"+name);
					System.out.println("Mobile No :"+mob);
					System.out.println("Native    :"+nat);
					System.out.println("Reason    :"+reason);
					System.out.println("Want to proceed to payment ? (Y/N)");
					String choice1 = sc.next();
					if(choice1.equalsIgnoreCase("y")) {
						System.out.println("Pay the amount : "+selectedHotel.price);
						System.out.print("Enter the Amount :");
						double amt = sc.nextDouble();
						if(selectedHotel.price == amt) {
							b[rNo-1] = false;
							selectedHotel.roomAvail++;
							System.out.println("Your room Booked successfully !!");
							ud.add(new UserDetails(selectedHotel.hotelId,name,mob,nat,reason,rNo));
						}
						else {
							System.out.println("Pay the given amount there is no any discounts");
						}
					}
					System.out.println("If you want to book again ? (Y/N)");
					String choice2 = sc.next();
					if(choice2.equalsIgnoreCase("y")) {
						guestDashBoard();
					}
					else {
						System.out.println("Does you need to checkout your room ? (Y/N)");
						String choice3 = sc.next();
						if(choice3.equalsIgnoreCase("y")) {
							b[rNo-1] = true;
							selectedHotel.roomAvail--;
							guestDashBoard();
						}
						else {
							HotelManagement.dis(hId);
						}
					}	
				}	
			}
	}
	
	static void Dispaly() {
		for(Entry<Integer, HotelDetails> e:hm.entrySet())
		{
			System.out.println(e.getKey()+"   "+e.getValue().hotelName);
		}
	}
}

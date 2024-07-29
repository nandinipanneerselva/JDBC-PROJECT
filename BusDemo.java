package Busresv;
import java.util.Scanner;
import java.sql.SQLException;

public class BusDemo {

	public static void main(String[] args) throws SQLException {
		BusDAO busdao=new BusDAO();
		try {
		busdao.displayBusInfo();
		
		int userOpt=1;
		
		Scanner sc=new Scanner(System.in);
		
		while(userOpt==1)
		{
			System.out.println("Enter 1 to book and 2 to exit ");
			userOpt =sc.nextInt();
			if(userOpt==1)
			{
				Booking booking=new Booking();
				if(booking.isAvailable())
				{
					BookingDAO bookingdao=new BookingDAO();
					bookingdao.addBooking(booking);
					System.out.println("Your booking is confirmed");
				}
			}
				else
				{
					System.out.println("Sorry.Bus is full,you cannot book");
				}
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

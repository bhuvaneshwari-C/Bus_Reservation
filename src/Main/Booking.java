package Main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Passenger Name: ");
        passengerName= scanner.next();
        System.out.println("Enter Bus No: ");
        busNo =scanner.nextInt();dfdfs
        System.out.println("Enter Date dd-mm-yyyy ");
        String dateInput =scanner.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }

    public boolean isAvailable() throws SQLException {
        BusDb busDb=new BusDb();
        BookingDb bookingDb=new BookingDb();
        int capacity= busDb.getCapacity(busNo);
        int booked=bookingDb.getBookedCount(busNo,date);
        return booked<capacity;
    }
}

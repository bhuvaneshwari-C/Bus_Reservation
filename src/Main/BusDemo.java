package Main;

import java.sql.SQLException;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
try {
    BusDb.displayBusInfo();
    int userOpt = 1;
    Scanner scanner = new Scanner(System.in);
    while (userOpt == 1) {
        System.out.println("Enter 1 to Book 2 to Exit");
        userOpt=scanner.nextInt();
        if (userOpt == 1) {
            Booking booking = new Booking();
            if (booking.isAvailable()) {
                BookingDb bookingDb = new BookingDb();
                bookingDb.addBooking(booking);
                System.out.println("Your Booking is Confirmed");
            } else
                System.out.println("Sorry Bus is full, Try another Bus or Date");
        }
    }
    scanner.close();
} catch (Exception e){
    System.out.println(e);
}
}
}

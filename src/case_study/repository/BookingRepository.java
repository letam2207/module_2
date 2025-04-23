package case_study.repository;

import case_study.entity.Booking;

import java.util.ArrayList;

public class BookingRepository implements IBookingRepository {

    private static ArrayList<Booking> bookings = new ArrayList<>();

    static {
        bookings.add(new Booking(1,"20-3-2025","23-3-2025","24-3-2025",1,1));
        bookings.add(new Booking(2,"20-4-2025","23-4-2025","24-4-2025",2,3));
    }

    @Override
    public ArrayList<Booking> findAll() {
        return bookings;
    }

}

package case_study.entity;

public class Booking extends Person {
    int bookingId;
    String bookingDate;
    String bookingStartDate;
    String bookingStopDate;
    int serviceId;

    public Booking() {
    }

    public Booking(int bookingId, String bookingDate, String bookingStartDate
            , String bookingStopDate, int serviceId,int id) {
        super(id);
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookingStartDate = bookingStartDate;
        this.bookingStopDate = bookingStopDate;
        this.serviceId = serviceId;
    }

    public Booking(int bookingId) {
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(String bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public String getBookingStopDate() {
        return bookingStopDate;
    }

    public void setBookingStopDate(String bookingStopDate) {
        this.bookingStopDate = bookingStopDate;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }
}

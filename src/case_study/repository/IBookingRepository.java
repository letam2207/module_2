package case_study.repository;

import case_study.entity.Booking;

import java.util.ArrayList;

public interface IBookingRepository {
    ArrayList<Booking> findAll();
}

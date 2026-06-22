package com.hotel;

import com.hotel.io.CsvHandler;
import com.hotel.model.Reservation;
import com.hotel.model.Room;
import com.hotel.service.ReservationService;
import com.hotel.threads.NotificationDispatcher;
import com.hotel.threads.PaymentProcessor;
import com.hotel.threads.ThreadStateTracker;
import com.hotel.threads.VirtualThreadSimulator;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {

            // Read Rooms from CSV
            List<Room> rooms = CsvHandler.readRooms();

            System.out.println("\nAvailable Rooms:");

            for (Room room : rooms) {
                System.out.println(room);
            }

            // Reservation Service
            ReservationService service = new ReservationService();

            List<Room> filteredRooms = service.findAvailableRooms(rooms, "Single", 200);

            System.out.println("\nFiltered Rooms:");

            for (Room room : filteredRooms) {
                System.out.println(room);
            }

            // Create Reservation
            Reservation reservation = new Reservation();

            reservation.setStatus("Pending");

            // Thread Class Example
            Object lock = new Object();

            PaymentProcessor payment = new PaymentProcessor(reservation, lock);

            payment.start();

            // Runnable Example
            Thread notification = new Thread(new NotificationDispatcher(reservation));

            notification.start();

            // Thread Lifecycle
            ThreadStateTracker.demonstrateLifecycle();

            // Virtual Threads
            VirtualThreadSimulator.runTest();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
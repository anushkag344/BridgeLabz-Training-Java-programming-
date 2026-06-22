package com.hotel.threads;

import com.hotel.model.Reservation;

public class NotificationDispatcher implements Runnable {

    private Reservation reservation;

    public NotificationDispatcher(
            Reservation reservation) {

        this.reservation = reservation;
    }

    @Override
    public void run() {

        reservation.setStatus("Confirmed");

        System.out.println(
                "Email Sent For Reservation"
        );
    }
}
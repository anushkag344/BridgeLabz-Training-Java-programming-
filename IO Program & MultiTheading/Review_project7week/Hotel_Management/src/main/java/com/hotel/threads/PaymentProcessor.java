package com.hotel.threads;

import com.hotel.model.Reservation;

public class PaymentProcessor extends Thread {

    private Reservation reservation;
    private Object lock;

    public PaymentProcessor(Reservation reservation,
                            Object lock) {
        this.reservation = reservation;
        this.lock = lock;
    }

    @Override
    public void run() {

        try {

            System.out.println("Processing Payment...");

            Thread.sleep(150);

            synchronized (lock) {

                lock.wait();

                reservation.setStatus("Paid");

                System.out.println("Payment Completed");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
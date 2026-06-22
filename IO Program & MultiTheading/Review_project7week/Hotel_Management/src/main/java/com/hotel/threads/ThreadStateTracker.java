package com.hotel.threads;

import com.hotel.model.Reservation;

public class ThreadStateTracker {

    public static void demonstrateLifecycle()
            throws Exception {

        Object lock = new Object();

        Reservation reservation =
                new Reservation();

        PaymentProcessor thread =
                new PaymentProcessor(
                        reservation,
                        lock);

        System.out.println(
                "NEW : "
                        + thread.getState());

        thread.start();

        System.out.println(
                "RUNNABLE : "
                        + thread.getState());

        Thread.sleep(50);

        System.out.println(
                "TIMED_WAITING : "
                        + thread.getState());

        Thread.sleep(200);

        System.out.println(
                "WAITING : "
                        + thread.getState());

        synchronized (lock) {

            lock.notify();

            System.out.println(
                    "BLOCKED/RUNNABLE : "
                            + thread.getState());
        }

        thread.join();

        System.out.println(
                "TERMINATED : "
                        + thread.getState());
    }
}
package com.hotel.threads;

import java.util.concurrent.Executors;

public class VirtualThreadSimulator {

    public static void runTest() {

        try (var executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 1; i <= 10; i++) {

                int id = i;

                executor.submit(() -> {

                    System.out.println(
                            "Booking Request "
                                    + id);
                });
            }
        }
    }
}
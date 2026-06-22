package com.hotel.io;

import com.hotel.model.Room;
import com.hotel.validation.RoomValidator;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {

    public static List<Room> readRooms() {

        List<Room> rooms = new ArrayList<>();
        RoomValidator validator = new RoomValidator();

        try {
//Resources folder se file read kar raha.
            InputStream is = CsvHandler.class
                    .getClassLoader()
                    .getResourceAsStream("rooms.csv");

            if (is == null) {
                throw new RuntimeException("rooms.csv not found in resources folder");
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(is));

            br.readLine(); // Skip Header

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Room room = new Room(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2]),
                        Boolean.parseBoolean(data[3])
                );

                if (validator.validate(room).isEmpty()) {

                    rooms.add(room);

                } else {

                    System.out.println("Invalid Room : " + room);
                }
            }

            br.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return rooms;
    }
}
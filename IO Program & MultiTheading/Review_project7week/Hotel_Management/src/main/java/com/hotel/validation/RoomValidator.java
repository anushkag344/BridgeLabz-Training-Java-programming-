package com.hotel.validation;

import com.hotel.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomValidator implements Validator<Room> {

    @Override
    public List<String> validate(Room room) {

        List<String> errors = new ArrayList<>();

        if (room.getRoomNumber() <= 0) {
            errors.add("Invalid Room Number");
        }

        if (room.getPricePerNight() <= 0) {
            errors.add("Invalid Price");
        }

        if (!room.getType().equalsIgnoreCase("Single")
                && !room.getType().equalsIgnoreCase("Double")
                && !room.getType().equalsIgnoreCase("Suite")) {

            errors.add("Invalid Room Type");
        }

        return errors;
    }
}
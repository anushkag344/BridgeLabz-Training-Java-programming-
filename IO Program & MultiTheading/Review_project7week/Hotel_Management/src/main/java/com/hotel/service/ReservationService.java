package com.hotel.service;

import com.hotel.model.Room;
import com.hotel.model.Reservation;

import java.util.*;
import java.util.stream.Collectors;

public class ReservationService {

    private final Map<String, List<Reservation>> bookingsByDate = new HashMap<>();
    private final Map<String, Double> revenueByRoomType = new HashMap<>();
    public List<Room> findAvailableRooms(List<Room> rooms, String type, double maxPrice){
        return rooms.stream()
                .filter(Room::isAvailable)
                .filter(room -> room.getType().equalsIgnoreCase(type))
                .filter(room -> room.getPricePerNight() <= maxPrice)
                .collect(Collectors.toList());
    }
    public void addBooking(String date, Reservation reservation){
        bookingsByDate.computeIfAbsent(date, k -> new ArrayList<>()).add(reservation);
    }

    public void trackRevenue(String roomType, double amount){
        revenueByRoomType.merge(roomType, amount, Double::sum);
    }
}
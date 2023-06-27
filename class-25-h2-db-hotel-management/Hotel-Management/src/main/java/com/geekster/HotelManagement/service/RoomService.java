package com.geekster.HotelManagement.service;

import com.geekster.HotelManagement.model.HotelRoom;
import com.geekster.HotelManagement.repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    IRoomRepo roomRepo;

    public Iterable<HotelRoom> getAllRooms() {
       return roomRepo.findAll();
    }

    public String addRoom(HotelRoom room) {
        roomRepo.save(room);
        return "added";
    }
}

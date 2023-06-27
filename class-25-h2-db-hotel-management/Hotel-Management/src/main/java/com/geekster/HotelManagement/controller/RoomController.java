package com.geekster.HotelManagement.controller;

import com.geekster.HotelManagement.model.HotelRoom;
import com.geekster.HotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    //read
    @GetMapping("rooms")
    public Iterable<HotelRoom> getAllRooms()
    {

        return roomService.getAllRooms();
    }


    @PostMapping("room")
    public String addRoom(@RequestBody HotelRoom room)
    {
        return roomService.addRoom(room);
    }
}

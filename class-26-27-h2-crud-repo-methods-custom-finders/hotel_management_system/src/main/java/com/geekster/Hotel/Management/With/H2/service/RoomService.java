package com.geekster.Hotel.Management.With.H2.service;

import com.geekster.Hotel.Management.With.H2.model.HotelRoom;
import com.geekster.Hotel.Management.With.H2.model.Type;
import com.geekster.Hotel.Management.With.H2.repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    IRoomRepo roomRepo;

    public Iterable<HotelRoom> getAllRooms() {
        return roomRepo.findAll();
    }

    public void addRooms(HotelRoom hotelRoom) {
         roomRepo.save(hotelRoom);
    }


    public String addRoms(List<HotelRoom> rooms) {
         roomRepo.saveAll(rooms);
         return "rooms added"+rooms;
    }

    public HotelRoom getRoomById(Integer id) {
        return roomRepo.getAllRoomById(id);
    }

    public boolean checkRoomExists(Integer id) {
        return roomRepo.existsById(id);
    }

    public Iterable<HotelRoom> getRoomsByIds(List<Integer> ids) {
        return roomRepo.findAllById(ids);
    }

    public Integer getTotalRooms() {
        return (int) roomRepo.count();
    }

    public String deleteRoomById(Integer id) {
        roomRepo.deleteById(id);
        return "room deleted successfully of id "+id;
    }

    public String updateRoomById(Integer id, Type type) {
        Optional<HotelRoom> myRoomOpt = roomRepo.findById(id);
        HotelRoom myRoom = null;
        if(myRoomOpt.isPresent())
        {
            myRoom = myRoomOpt.get();
        }
        else {
            return "Id not Found!!!";
        }
        myRoom.setRoomType(type);
        roomRepo.save(myRoom);
        return "room type updated";

    }

    public List<HotelRoom> getRoomsByStatus(Boolean status) {

        return roomRepo.findByRoomStatus(status);
    }

    public List<HotelRoom> getRoomsByStatusAndType(Boolean status, Type type) {
        return roomRepo.findByRoomStatusAndRoomType(status, type);
    }

    public List<HotelRoom> getRoomsByStatusAndTypeAndPrice(Boolean status, Type type, Double lLimit, Double uLimit) {

        return roomRepo.findByRoomStatusAndRoomTypeAndRoomPriceGreaterThanAndRoomPriceLessThan( status,  type,  lLimit,  uLimit);
    }

    public List<HotelRoom> getRoomsByTypeAndPriceSortedDesc(Type roomType) {

        return roomRepo.findByRoomTypeOrderByRoomPriceDesc(roomType);
    }

    public List<HotelRoom> getBudgetedAcOrNonAC(Type roomType1, Type roomType2, Double lLimit, Double uLimit) {
        return roomRepo.findByRoomTypeAndRoomPriceBetweenOrRoomType(roomType1,lLimit, uLimit,roomType2);
    }
}

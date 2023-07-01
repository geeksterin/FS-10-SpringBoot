package com.geekster.Hotel.Management.With.H2.repository;

import com.geekster.Hotel.Management.With.H2.model.HotelRoom;
import com.geekster.Hotel.Management.With.H2.model.Type;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom,Integer> {

    List<HotelRoom> findByRoomStatus(Boolean roomStatus);

    List<HotelRoom> findByRoomStatusAndRoomType(Boolean status, Type type);

    List<HotelRoom> findByRoomStatusAndRoomTypeAndRoomPriceGreaterThanAndRoomPriceLessThan(Boolean status, Type type, Double lLimit, Double uLimit);

    List<HotelRoom> findByRoomTypeOrderByRoomPriceDesc(Type type);

    List<HotelRoom> findByRoomTypeAndRoomPriceBetweenOrRoomType(Type type1,Double lLimit, Double uLimit,Type type2);

    @Query(value = "select * from Room where room_id = :id" , nativeQuery = true)
    HotelRoom getAllRoomById(Integer id);

    //update query:




}

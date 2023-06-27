package com.geekster.HotelManagement.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Room")
public class HotelRoom {
    @Id
    private Long roomId;
    @Column(unique = true)
    private Integer roomNumber;
    private Type roomType;
    private Double roomPrice;
    @Column(name = "status")
    private Boolean roomStatus;
}

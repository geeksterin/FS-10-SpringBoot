package com.geekster.Hotel.Management.With.H2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Room")
public class HotelRoom {
    @Id
    private Integer roomId;

    @Column(unique = true)
    private Integer roomNumber;

    @Enumerated(EnumType.STRING)
    private Type roomType;

    private Double roomPrice;

    @Column(name = "status")
    private Boolean roomStatus;
}

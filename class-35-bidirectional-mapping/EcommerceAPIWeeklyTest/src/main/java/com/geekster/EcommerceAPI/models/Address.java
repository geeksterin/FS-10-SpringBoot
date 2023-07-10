package com.geekster.EcommerceAPI.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Users user;


}

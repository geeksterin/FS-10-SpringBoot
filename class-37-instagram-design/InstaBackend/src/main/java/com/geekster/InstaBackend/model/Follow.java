package com.geekster.InstaBackend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer followId;


    @OneToOne
    @JoinColumn(name = "fk_actual_user")
    User currentUser;

    @OneToOne
    @JoinColumn(name = "fk_follower_of_actual_user")
    User currentUserFollower;


}

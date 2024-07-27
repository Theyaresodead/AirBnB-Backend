package com.example.airbnb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="User")
public class User extends BaseClass {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int phone;

    @Column
    private String bio;

    @Enumerated(EnumType.STRING)
    private User_Type userType;

    @OneToMany
    private List<Listings> listing_id;

    @OneToMany
    private List<Bookings> booking_id;



}

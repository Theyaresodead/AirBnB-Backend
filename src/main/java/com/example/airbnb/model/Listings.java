package com.example.airbnb.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Listings extends BaseClass{

    @ManyToOne()
    private User user; // Join with host id is left for now

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String location;

    @Enumerated(EnumType.STRING)
    private Bnb_Type accomodation;

    @Column(nullable = false)
    private boolean available;

    @Column(nullable = false)
    private double cost_per_night;

    @OneToMany
    private List<Listings> listing_id;

}

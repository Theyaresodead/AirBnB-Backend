package com.example.airbnb.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bookings extends BaseClass {

    @ManyToOne
    private User user; // join with the host id is left for now

    @ManyToOne
    private Listings listing_id; // left for now

    @CreatedDate
    @Column(nullable = false)
    private Date check_in_Date;

    @Column(nullable = false)
    @LastModifiedDate
    private Date check_out_Date;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    private double totalPrice;

}

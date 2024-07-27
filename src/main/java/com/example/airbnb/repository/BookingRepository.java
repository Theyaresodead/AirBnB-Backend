package com.example.airbnb.repository;

import com.example.airbnb.model.Bookings;
import com.example.airbnb.model.Listings;
import com.example.airbnb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<User, Listings> {
    @Query("Select b from Bookings as b where b.user.name =:title and b.listing_id.available=:avail" )
    Optional<Bookings> findByTitleAndDescription(String title, boolean avail);
}

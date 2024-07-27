package com.example.airbnb.repository;

import com.example.airbnb.model.Listings;
import com.example.airbnb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Details of the user
  //  @Query("Select u from User as u  where u.name=:username")
  //  Optional<User> findByUsername(String username);

    // Listings held by the user
  //  @Query("Select u.listing_id from User as u ")
   // Optional<List<Listings>> findAllListings();


}

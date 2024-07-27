package com.example.airbnb.repository;

import com.example.airbnb.model.Listings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ListingRepository extends JpaRepository<Listings,Integer> {

    // Hibernate Query
    @Query("Select l from Listings as l where l.title=:title and l.description=:desc" )
   Optional<Listings> findByTitleAndDescription(String title, String desc);
}

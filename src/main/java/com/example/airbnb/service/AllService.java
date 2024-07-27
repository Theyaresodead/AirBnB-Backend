package com.example.airbnb.service;

import com.example.airbnb.model.Bookings;
import com.example.airbnb.model.Listings;
import com.example.airbnb.repository.BookingRepository;
import com.example.airbnb.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AllService implements CommandLineRunner {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private ListingRepository listingRepository;

    public AllService(BookingRepository bookingRepository, ListingRepository listingRepository) {
        this.bookingRepository = bookingRepository;
        this.listingRepository = listingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       System.out.println("Start From here");

   /*     User user= User.builder()
                .name("Utkarsh")
                .email("utkarshtewari678@gmai.com")
                .password("ABC")
                .phone(9506135).userType(User_Type.GUEST).build();
        bookingRepository.save(user);
       Listings listing =Listings.builder().title("Home Sweet")
               .description("Fine House")
               .location("Andheri")
               .accomodation(Bnb_Type.ROOM)
               .available(true)
               .cost_per_night(13000.0)
               .user(user)
               .build();
       listingRepository.save(listing);
      List<Listings> listings = listingRepository.findAll();
      for(Listings l:listings){
          System.out.println(l.getTitle()+" "+l.getUser().getName());

    */

       Optional<Listings> listres = listingRepository.findByTitleAndDescription("House","Great");
         if(listres.isPresent()){
             System.out.println(listres.get().getAccomodation());
         }



     //   Optional<Bookings> bookings =bookingRepository.findByTitleAndDescription("Utkarsh",true);
     //   if(bookings.isPresent()){
          //  System.out.println(bookings.get().getStatus());
      //  }else {
        //    System.out.println("Not found");
       // }
      }
    }

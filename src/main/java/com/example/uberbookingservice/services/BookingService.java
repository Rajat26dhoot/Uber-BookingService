package com.example.uberbookingservice.services;

import com.example.uberbookingservice.dto.CreateBookingDto;
import com.example.uberbookingservice.dto.CreateBookingResponeDto;
import com.example.uberentityservice.models.Booking;
import org.springframework.stereotype.Service;


public interface BookingService {

    CreateBookingResponeDto createBooking(CreateBookingDto createBookingDto);

}

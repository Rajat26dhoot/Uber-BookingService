package com.example.uberbookingservice.controllers;


import com.example.uberbookingservice.dto.CreateBookingDto;
import com.example.uberbookingservice.dto.CreateBookingResponeDto;
import com.example.uberbookingservice.services.BookingService;
import com.example.uberentityservice.models.Booking;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("API is working!");
    }

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<CreateBookingResponeDto> createBooking(@RequestBody CreateBookingDto createBookingDto) {
        System.out.println("createBookingDto");
        return new ResponseEntity<>(bookingService.createBooking(createBookingDto), HttpStatus.CREATED);
    }

}

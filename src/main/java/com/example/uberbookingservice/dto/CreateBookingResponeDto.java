package com.example.uberbookingservice.dto;

import com.example.uberentityservice.models.Driver;
import lombok.*;

import java.util.Optional;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookingResponeDto {
    private Long bookingId;
    private String bookinStatus;
    private Optional<Driver> driver;
}

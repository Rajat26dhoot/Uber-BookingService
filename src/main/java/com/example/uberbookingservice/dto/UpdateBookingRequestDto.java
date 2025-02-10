package com.example.uberbookingservice.dto;

import com.example.uberentityservice.models.BookingStatus;

import lombok.*;
import java.util.Optional;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateBookingRequestDto {

    private String status;
    private Optional<Long> driverId;

}

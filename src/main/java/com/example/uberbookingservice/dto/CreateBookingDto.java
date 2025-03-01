package com.example.uberbookingservice.dto;


import com.example.uberentityservice.models.ExactLocation;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookingDto {

    private  Long passengerId;
    private ExactLocation startLocation;
    private ExactLocation endLocation;


}

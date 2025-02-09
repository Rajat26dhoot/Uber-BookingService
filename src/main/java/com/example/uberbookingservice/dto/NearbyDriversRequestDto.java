package com.example.uberbookingservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NearbyDriversRequestDto {
    Double latitude;
    Double longitude;
}

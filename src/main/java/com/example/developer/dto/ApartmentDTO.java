package com.example.developer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentDTO {

    private int apartment_id;
    private int floor;
    private float area;
    private float price;
    private int number;
    private int rooms;
    private String image;
    private String title;
}
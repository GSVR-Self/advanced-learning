package com.location.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postal_data")
@Data
@NoArgsConstructor
public class PostalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String divisionName;
    private String area;
    private String pincode;
    private String district;
    private String stateName;
    private String country;
    private Double latitude;
    private Double longitude;
}
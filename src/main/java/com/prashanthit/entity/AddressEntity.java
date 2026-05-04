package com.prashanthit.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDetailsEntity user;
    private String flatNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}


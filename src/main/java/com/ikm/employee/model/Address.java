package com.ikm.employee.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Entity
@Table(name="address")


public class Address {
  

    @Id
    @Column(name="addressid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int addressid;


    // @Id
    // @Column(name="empid")
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    // int empid;


    @NotBlank
    @Column(name="housename")
    String housename;


    @Column(name="place")
    String place;


    @Column(name="pincode")
    String pincode;
  
    
}

    


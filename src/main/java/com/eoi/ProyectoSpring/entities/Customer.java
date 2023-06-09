package com.eoi.ProyectoSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer")
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

   private String name;
   private String secondName;
   private String thirdName;
   private LocalDate birthDate;
   private LocalDateTime registrationDateTime;

    public Customer(String name, String secondname, String thirdname, LocalDate birthDate, LocalDateTime registrationDateTime) {
        this.name = name;
        this.secondName = secondname;
        this.thirdName = thirdname;
        this.birthDate = birthDate;
        this.registrationDateTime = registrationDateTime;
    }
}

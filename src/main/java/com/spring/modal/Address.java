package com.spring.modal;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long address_id;
    private String street;
    private String city;
    private String state;
    private String zipcode;
    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "user_id")
    private User user;
}

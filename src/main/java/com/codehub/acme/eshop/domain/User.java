package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Role;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

/**
 * This domain class represents a user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
   /**
    * the user id
    */
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   //@Column(name = "USER_ID",nullable = false)
   private Long id;
   /**
    * the username
    */
   private String username;
   /**
    * the password
    */
   private String password;
   /**
    * the name
    */
   private String name;
   /**
    * the surname
    */
   private String surname;
   /**
    * the email
    */
   private String email;
   /**
    * the phone number
    */
   private String phoneNumber;
   /**
    * the address
    */
   private String address;
   /**
    * the postal code
    */
   private String postCode;
   /**
    * the Shopping Basket
    */
   @OneToOne
   @JsonBackReference
   private ShoppingBasket shoppingBasket;
   /**
    * The role
    * {@link Role}
    */
   @Enumerated(EnumType.STRING)
   private Role role;
}
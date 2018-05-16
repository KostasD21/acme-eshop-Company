package com.codehub.acme.eshop.domain;

import com.codehub.acme.eshop.enumerator.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "USER_ID", nullable = false)
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
    * {@link com.codehub.acme.eshop.enumerator.Role}
    */
   private Role role;
}

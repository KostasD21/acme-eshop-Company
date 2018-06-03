package com.codehub.acme.eshop.transformation;

import com.codehub.acme.eshop.domain.ShoppingBasket;
import com.codehub.acme.eshop.domain.User;
import com.codehub.acme.eshop.enumerator.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The data transfer object for the {@link User} domain
 */
public class UserDto {
    /**
     * the user id
     */
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
    @JsonIgnore
    private ShoppingBasket shoppingBasket;
    /**
     * The role
     * {@link Role}
     */
    private Role role;
    /**
     * The token for the user authentication
     */
    private String token;

    /**
     * Constructor with all the fields
     *
     * @param id the user id
     * @param username the username
     * @param password the password
     * @param name the name
     * @param surname the surname
     * @param email the email
     * @param phoneNumber the phone number
     * @param address the address
     * @param postCode the post code
     * @param shoppingBasket the shopping basket
     * @param role the role
     * @param token the token
     */
    public UserDto(Long id, String username, String password, String name, String surname, String email, String phoneNumber, String address, String postCode, ShoppingBasket shoppingBasket, Role role, String token) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postCode = postCode;
        this.shoppingBasket = shoppingBasket;
        this.role = role;
        this.token = token;
    }

    /**
     * this method gets the id
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * this method sets the id
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * this method gets the username
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * this method sets the username
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * this method gets the password
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * this method sets the password
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * this method gets the name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * this method sets the name
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this method gets the surname
     *
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * this method sets the surname
     *
     * @param surname the surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * this method gets the email
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * this method sets the email
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * this method gets the phoneNumber
     *
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * this method sets the phoneNumber
     *
     * @param phoneNumber the phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * this method gets the address
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * this method sets the address
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * this method gets the postCode
     *
     * @return the postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * this method sets the postCode
     *
     * @param postCode the postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * this method gets the shoppingBasket
     *
     * @return the shoppingBasket
     */
    public ShoppingBasket getShoppingBasket() {
        return shoppingBasket;
    }

    /**
     * this method sets the shoppingBasket
     *
     * @param shoppingBasket the shoppingBasket
     */
    public void setShoppingBasket(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    /**
     * this method gets the role
     *
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * this method sets the role
     *
     * @param role the role
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * this method gets the token
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * this method sets the token
     *
     * @param token the token
     */
    public void setToken(String token) {
        this.token = token;
    }
}

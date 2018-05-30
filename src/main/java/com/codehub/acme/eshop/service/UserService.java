package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.User;

import java.util.List;
import java.util.Optional;

/**
 * This interface contains the signature of methods regarding the
 * {@link com.codehub.acme.eshop.domain.User} functionality
 */
public interface UserService {

    /**
     *This method adds a Category to the Database
     *    //  * @param id           the user id
     *    //  * @param username     the username
     *    //  * @param password     the login password
     *    //  * @param description  the Category description
     *    //  * @param name        the name
     *    //  * @param surname     the surname
     *    //  * @param address     the address
     *    //  * @param postalCode  the postal code
     * @return {@link User}
     */
    User addUser(User user);


    /**
     * This method removes a user from the DB
     * @param username  the username
     *
     */
    void removeUser(String username);

    /**
     * This method removes a User from the DB regarding the given Id
     * @param id  the users ID
     *
     */
    void removeUserById(Long id);

    /**
     *This method authenticate a user
     *
     * @param password login password for the user
     */
    void authenticateUser (String password);

    /**
     * This method returns the list of Users from the database
     * @return a {@link List} of {@link User}
     */
    List<User> getAllUsers();

    /**
     * This methods searches and returns a Users from the DB regarding on the given id
     * @param id the user id
     * @return a {@link User}
     */
    Optional <User> getUserById(Long id);

    /**
     * This methods searches and returns a Users from the DB regarding on the given username
     * @param username the username of user
     * @return a {@link User}
     */
    User findUserByUsermane(String username);


}

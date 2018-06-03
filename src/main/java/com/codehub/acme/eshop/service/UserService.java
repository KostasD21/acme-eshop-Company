package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.User;
import com.codehub.acme.eshop.domain.UserLogin;

import java.util.List;

/**
 * This interface contains the signature of methods regarding the
 * {@link User} functionality
 */
public interface UserService {

    /**
     * This method adds a user
     * @param user the user to be saved
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
     * This method authenticate a user
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
    User getUserById(Long id);

    /**
     * This methods searches and returns a Users from the DB regarding on the given username
     * @param username the username of user
     * @return a {@link User}
     */
    User findUserByUsermane(String username);

    /**
     * This method authenticates a user with the provided token
     *
     * @param token the token
     * @return the authenticated user
     */
    User authenticate(String token);

    /**
     * This method is uesed to login the {User}
     * @param userLogin the user provides username/password
     * @return {@link User}
     */
    User login(UserLogin userLogin);
}

package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.User;

import java.util.List;
import java.util.Optional;

/**
 * This interface contains the signature of methods regarding the
 * {@link com.codehub.acme.eshop.domain.User} functionality
 */
public interface UserService {

    void addUser(User user);

    void removeUser(String username);

    void removeUserById(Long id);


    /**
     *This method authenticate a user
     *
     * @param password login password for the user
     */
    void authenticateUser (String password);

    List<User> getAllUsers();

   Optional <User> getUserById(Long id);

    User findUserByUsermane(String username);
}

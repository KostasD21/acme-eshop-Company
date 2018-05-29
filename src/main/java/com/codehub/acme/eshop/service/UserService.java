package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.User;

/**
 * This interface contains the signature of methods regarding the
 * {@link User} functionality
 */
public interface UserService {

    /**
     * This create a user
     *
     */
    void registerUser();

    /**
     *This method authenticate a user
     *
     * @param password login password for the user
     */
    void authenticateUser (String password);

    /**
     * This method shows the User's profile information
     *
     *  @param userId the userId
        @return  the{@link User}
     *
     */
     User getUserInfo(Long userId);

    /**
     * This method update the User's profile informations
     *
     */
        void updateUserInfo (Long userId);
}

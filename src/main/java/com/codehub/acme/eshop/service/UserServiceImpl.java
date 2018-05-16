package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.User;
import org.springframework.stereotype.Service;

/**
 * This service contains the implementation of methods regarding the {@link User} functionality
 */

@Service
public class UserServiceImpl implements UserService {

    /**
     *  {@inheritDoc}
     */
    @Override
    public void registerUser() {

    }

    /**
     *  {@inheritDoc}
     */
    @Override
    public void authenticateUser(String password) {

    }

    /**
     *  {@inheritDoc}
     */
    @Override
    public User getUserInfo(Long userId) {
        return null;
    }

    /**
     *  {@inheritDoc}
     */
    @Override
    public void updateUserInfo(Long userId) {

    }
}

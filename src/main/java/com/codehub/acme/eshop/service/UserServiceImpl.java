package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.User;
import com.codehub.acme.eshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;

/**
 * This service contains the implementation of methods regarding the {@link User} functionality
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public User addUser(User user) {
        String token = generateRandomHexToken(10);
        user.setToken(token);
        return userRepository.save(user);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeUser(String username) {
        userRepository.deleteByUsername(username);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeUserById(Long id) {
        userRepository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void authenticateUser(String password) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id).get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User findUserByUsermane(String username) {
        return userRepository.findUserByUsername(username);
    }

    private String generateRandomHexToken(int byteLength) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] token = new byte[byteLength];
        secureRandom.nextBytes(token);
        return new BigInteger(1, token).toString(16); //hex encoding
    }
}

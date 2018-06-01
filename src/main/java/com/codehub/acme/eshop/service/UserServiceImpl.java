package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.User;
import com.codehub.acme.eshop.domain.UserLogin;
import com.codehub.acme.eshop.exception.PasswordInvalidException;
import com.codehub.acme.eshop.exception.TokenInvalidException;
import com.codehub.acme.eshop.exception.UsernameInvalidException;
import com.codehub.acme.eshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * This service contains the implementation of methods regarding the {@link User} functionality
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private final Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();

    private static final String PASSWORD_SALT = "passw0rd";


    /**
     * {@inheritDoc}
     */
    @Override
    public User addUser(User user) {
        String token = generateRandomHexToken(10);
        user.setToken(token);
        String password = user.getPassword();
        user.setPassword(passwordEncoder.encodePassword(password, PASSWORD_SALT));
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
    public Optional<User> getUserById(Long id) {
        return userRepository.getUserById(id);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public User authenticate(String token) {
        User user = userRepository.findByToken(token);
        if (user == null) {
            throw new TokenInvalidException("The token is invalid");
        }
        return user;
    }

    /**
     * {@inheritDoc}
     */
    public User login(UserLogin userLogin) {

        User user = userRepository.getByUsername(userLogin.getUsername());

        if (user == null){
            throw new UsernameInvalidException("The username is invalid");
        }

        if (userLogin.getPassword() == null || !encode(userLogin.getPassword()).equals(user.getPassword())) {
            throw new PasswordInvalidException("The password is invalid");
        }

        String token = generateRandomHexToken(10);
        user.setToken(token);
        userRepository.save(user);

        return user;
    }

    /**
     * This method is used to encode the provided password
     * @param plainTextPassword
     * @return encoded password
     */
    private String encode(final String plainTextPassword) {
        return passwordEncoder.encodePassword(plainTextPassword, PASSWORD_SALT);
    }


}

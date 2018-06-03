package com.codehub.acme.eshop.service;


import com.codehub.acme.eshop.domain.User;

/**
 *
 * This interface contains the signature of methods regarding the
 * {@link User} functionality
 */
public interface MailService {

    /**
     * This method send an authentication email to the user
     * @param email   user's email
     */

    void sendMail(String email);
}

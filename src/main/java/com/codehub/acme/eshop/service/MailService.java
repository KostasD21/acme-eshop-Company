package com.codehub.acme.eshop.service;



/**
 *
 * This interface contains the signature of methods regarding the
 * {@link com.codehub.acme.eshop.domain.User} functionality
 */
public interface MailService {

    /**
     * This method send an authentication email to the user
     * @param email   user's email
     */

    void sendMail(String email);
}

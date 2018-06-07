package com.codehub.acme.eshop.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * This utility class is used to generate random string
 */
public class GeneratorUtils {

    /**
     * This method generates a random string
     *
     * @param byteLength the length of the string
     * @return the generated random string
     */
    public static String generateRandomHexToken(int byteLength) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] token = new byte[byteLength];
        secureRandom.nextBytes(token);
        return new BigInteger(1, token).toString(16); //hex encoding
    }
}

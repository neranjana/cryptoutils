package com.neranjana.cryptoutils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class HashGenerator {

    private HashAlgorithm hashAlgorithm;
    private MessageDigest messageDigest;

    public HashGenerator(HashAlgorithm hashAlgorithm) throws NoSuchAlgorithmException {
        this.hashAlgorithm = hashAlgorithm;
        this.messageDigest = MessageDigest.getInstance(hashAlgorithm.getAlgorithmString());
    }

    public String generateHash(String string) {
        messageDigest.update(string.getBytes());
        byte[] hashBytes = messageDigest.digest();
        StringBuilder hexHashStringBuilder = new StringBuilder();
        for (int i = 0; i < hashBytes.length; i++) {
            hexHashStringBuilder.append(Integer.toHexString(0xFF & hashBytes[i]));
        }
        return hexHashStringBuilder.toString();
    }

}

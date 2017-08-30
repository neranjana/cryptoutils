package com.neranjana.cryptoutils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HashGeneratorTest {
    @Test
    public void generateHash() throws Exception {
        HashGenerator hashGenerator = new HashGenerator(HashAlgorithm.SHA256);
        assertEquals("4e9518575422c987396887ce2477ab5f55a4aa3d161c5c22a996babb8b35", hashGenerator.generateHash("This is a string"));
    }


}
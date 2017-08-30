package com.neranjana.cryptoutils;

public enum HashAlgorithm {
    MD2("MD2"),
    MD5("MD5"),
    SHA1("SHA-1"),
    SHA256("SHA-256"),
    SHA384("SHA-384"),
    SHA512("SHA-512");

    private final String algorithmString;

    HashAlgorithm(String algorithmString) {
        this.algorithmString = algorithmString;
    }

    public String getAlgorithmString() {
        return algorithmString;
    }

}

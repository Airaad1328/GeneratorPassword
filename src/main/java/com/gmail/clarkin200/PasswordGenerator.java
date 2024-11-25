package com.gmail.clarkin200;

import java.security.SecureRandom;

public class PasswordGenerator {

    private final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private final String NUMBER = "0123456789";
    private final String OTHER_CHAR = "!@#$%&*()_+-=[]?";

    private final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;
    private final SecureRandom RANDOM = new SecureRandom();

    public String generatePassword(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Довжина пароля має бути більше 0");
        }

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomCharIndex = RANDOM.nextInt(PASSWORD_ALLOW_BASE.length());
            password.append(PASSWORD_ALLOW_BASE.charAt(randomCharIndex));
        }
        return password.toString();
    }

}

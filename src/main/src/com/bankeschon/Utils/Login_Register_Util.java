package com.bankeschon.Utils;

import java.util.Random;

public class Login_Register_Util {

    public void validationEmail(String login) throws Exception {
        if (login != null && login.trim().length() != 0) {
            if (!login.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                throw new Exception("Merci de saisir une adresse mail valide.");
            }
        } else {
            throw new Exception("Merci de saisir une adresse mail.");
        }
    }

    public String generateRandomString() {
        String foo = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] charArray = foo.toCharArray();
        int $length = 255;
        String randomString = "";
        int $i;
        Random r = new Random();
        for ($i = 0; $i < $length; $i++) {
            int n = r.nextInt(52);
            randomString += charArray[n];
        }
        return randomString;
    }

    public void validationName(String name) throws Exception {
        if (name != null && name.trim().length() < 3) {
            throw new Exception("Merci de saisir un nom de plus de 3 charactères.");
        }

        if (name != null && name.trim().length() < 3) {
            throw new Exception("Merci de saisir un nom de plus de 3 charactères.");
        }
    }
}



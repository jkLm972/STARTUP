package fr.efrei.util;

import java.util.UUID;

public class Helper {

    public static boolean isNullOrEmpty(String s) {
        if ((s == null) || (s.isEmpty())){
            return true;
        }
        else {
            return false;
        }
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}

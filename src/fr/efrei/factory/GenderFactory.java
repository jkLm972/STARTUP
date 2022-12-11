package fr.efrei.factory;

import fr.efrei.domain.Gender;
import fr.efrei.util.Helper;

public class GenderFactory {
    public static Gender creatGender(String type) {
        if (Helper.isNullOrEmpty(type)) {
            return null;
        }
        Gender gender = new Gender.Builder()
                .setType(type)
                .build();
        return gender;
    }
}

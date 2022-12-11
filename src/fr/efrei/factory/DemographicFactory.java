package fr.efrei.factory;

import fr.efrei.domain.Demographic;
import fr.efrei.util.Helper;

public class DemographicFactory {
    public static Demographic creatDemographic(String genderType, String raceType){
        if ((Helper.isNullOrEmpty(genderType)) || Helper.isNullOrEmpty(raceType)){
            return null;
        }
        Demographic demographic = new Demographic.Builder()
                .setGenderType(genderType)
                .setRaceType(raceType)
                .build();

        return demographic;
    }

    public static Demographic creatDemographic(String genderType){
        if ((Helper.isNullOrEmpty(genderType))){
            return null;
        }
        Demographic demographic = new Demographic.Builder()
                .setGenderType(genderType)
                .build();

        return demographic;
    }
}

package fr.efrei.repository;

import fr.efrei.domain.Demographic;
import java.util.ArrayList;
import java.util.List;

public class DemographicRepository implements IDemographicRepository{
    private static DemographicRepository repository = null;
    private List<Demographic> demographicDB = null;

    private DemographicRepository() {
        demographicDB = new ArrayList<Demographic>();
    }


    public static DemographicRepository getRepository() {
        if (repository == null){
            return new DemographicRepository();
        }
        return repository;
    }

    @Override
    public Demographic create(Demographic demographic) {
        boolean success = demographicDB.add(demographic);
        if (success){
            return demographic;
        }
        else {
            return null;
        }
    }

    @Override
    public Demographic read(String s) {
        for (Demographic r : demographicDB){
            if (r.getGenderType().equals(s)){
                return r;
            }

        }
        return null;
    }

    @Override
    public Demographic update(Demographic demographic) {
        Demographic oldDemographic = read(demographic.getGenderType());
        if (demographic != null){
            demographicDB.remove(oldDemographic);
            demographicDB.add(demographic);
            return demographic;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Demographic demographicToDelete = read(s);
        if (demographicToDelete == null) {
            return false;
        }
        demographicDB.remove(demographicToDelete);
        return true;
    }

    @Override
    public List<Demographic> getAll() {
        return demographicDB;
    }
}

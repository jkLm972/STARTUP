package fr.efrei.repository;

import fr.efrei.domain.Identity;
import java.util.ArrayList;
import java.util.List;

public class IdentityRepository implements IIdentityRepository{
    private static IdentityRepository repository = null;
    private List<Identity> identityDB = null;

    private IdentityRepository() {
        identityDB = new ArrayList<Identity>();
    }


    public static IdentityRepository getRepository() {
        if (repository == null){
            return new IdentityRepository();
        }
        return repository;
    }

    @Override
    public Identity create(Identity identity) {
        boolean success = identityDB.add(identity);
        if (success){
            return identity;
        }
        else {
            return null;
        }
    }

    @Override
    public Identity read(String s) {
        for (Identity r : identityDB){
            if (r.getIdentityName().equals(s)){
                return r;
            }

        }
        return null;
    }

    @Override
    public Identity update(Identity identity) {
        Identity oldIdentity = read(identity.getIdentityName());
        if (identity != null){
            identityDB.remove(oldIdentity);
            identityDB.add(identity);
            return identity;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Identity identityToDelete = read(s);
        if (identityToDelete == null) {
            return false;
        }
        identityDB.remove(identityToDelete);
        return true;
    }

    @Override
    public List<Identity> getAll() {
        return identityDB;
    }
}

package fr.efrei.repository;

import fr.efrei.domain.Identity;
import java.util.List;

public interface IIdentityRepository extends IRepository<Identity, String>{

    public List<Identity> getAll();

}

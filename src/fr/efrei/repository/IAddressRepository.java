package fr.efrei.repository;

import fr.efrei.domain.Address;
import java.util.List;

public interface IAddressRepository extends IRepository<Address, String>{

    public List<Address> getAll();

}

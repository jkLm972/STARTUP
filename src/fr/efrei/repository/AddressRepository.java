package fr.efrei.repository;

import fr.efrei.domain.Address;
import java.util.ArrayList;
import java.util.List;

public class AddressRepository implements IAddressRepository{
    private static AddressRepository repository = null;
    private List<Address> addressDB = null;

    private AddressRepository() {
        addressDB = new ArrayList<Address>();
    }


    public static AddressRepository getRepository() {
        if (repository == null){
            return new AddressRepository();
        }
        return repository;
    }

    @Override
    public Address create(Address address) {
        boolean success = addressDB.add(address);
        if (success){
            return address;
        }
        else {
            return null;
        }
    }

    @Override
    public Address read(String s) {
        for (Address r : addressDB){
            if (r.getStreetAddress().equals(s)){
                return r;
            }

        }
        return null;
    }

    @Override
    public Address update(Address address) {
        Address oldAddress = read(address.getStreetAddress());
        if (address != null){
            addressDB.remove(oldAddress);
            addressDB.add(address);
            return address;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Address addressToDelete = read(s);
        if (addressToDelete == null) {
            return false;
        }
        addressDB.remove(addressToDelete);
        return true;
    }

    @Override
    public List<Address> getAll() {
        return addressDB;
    }
}


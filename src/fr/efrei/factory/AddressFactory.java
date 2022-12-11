package fr.efrei.factory;

import fr.efrei.domain.Address;
import fr.efrei.util.Helper;
import java.util.*;

public class AddressFactory {

    public static Address creatAddress(String postalAddress, String streetAddress){
        if (Helper.isNullOrEmpty(postalAddress) || Helper.isNullOrEmpty(streetAddress)){
            return null;
        }
        Address address = new Address.Builder()
                .setStreetAddress(streetAddress)
                .setPostalAddress(postalAddress)
                .build();
        return address;
    }

    public static Address creatAddress(String streetAddress){
        if (Helper.isNullOrEmpty(streetAddress)){
            return null;
        }
        Address address = new Address.Builder()
                .setPostalAddress(streetAddress)
                .build();
        return address;
    }
}

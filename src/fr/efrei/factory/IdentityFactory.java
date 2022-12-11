package fr.efrei.factory;
import fr.efrei.domain.Identity;
import fr.efrei.util.Helper;
import java.util.*;
public class IdentityFactory {

    public static Identity creatIdentity(String identityName, String identityValue){
        if (Helper.isNullOrEmpty(identityName) || Helper.isNullOrEmpty(String.valueOf(identityValue)))  {
            return null;
        }
        Identity identity = new Identity.Builder()
                .setIdentityName(identityName)
                .setIdentityValue(identityValue)
                .build();

        return identity;
    }

    public static Identity creatIdentity(String identityName){
        if (Helper.isNullOrEmpty(identityName)){
            return null;
        }
        Identity identity = new Identity.Builder()
                .setIdentityName(identityName)
                .build();

        return identity;
    }
}
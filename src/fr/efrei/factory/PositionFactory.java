package fr.efrei.factory;
import fr.efrei.domain.Position;
import fr.efrei.util.Helper;

public class PositionFactory {
    public static Position creatPosition(String code, String statut){

        if ((Helper.isNullOrEmpty(code)) || Helper.isNullOrEmpty(statut)){
            return null;
        }

        Position position = new Position.Builder()
                .setCode(code)
                .setStatut(statut)
                .build();

        return position;
    }

    public static Position creatPosition(String code){

        if (Helper.isNullOrEmpty(code)){
            return null;
        }

        Position position = new Position.Builder()
                .setCode(code)
                .build();

        return position;
    }
}
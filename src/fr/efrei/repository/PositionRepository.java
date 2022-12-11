package fr.efrei.repository;

import fr.efrei.domain.Position;
import java.util.ArrayList;
import java.util.List;

public class PositionRepository implements IPositionRepository{
    private static PositionRepository repository = null;
    private List<Position> positionDB = null;

    private PositionRepository() {
        positionDB = new ArrayList<Position>();
    }


    public static PositionRepository getRepository() {
        if (repository == null){
            return new PositionRepository();
        }
        return repository;
    }

    @Override
    public Position create(Position position) {
        boolean success = positionDB.add(position);
        if (success){
            return position;
        }
        else {
            return null;
        }
    }

    @Override
    public Position read(String s) {
        for (Position r : positionDB){
            if (r.getCode().equals(s)){
                return r;
            }
        }
        return null;
    }

    @Override
    public Position update(Position position) {
        Position oldPosition = read(position.getCode());
        if (position != null){
            positionDB.remove(oldPosition);
            positionDB.add(position);
            return position;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Position positionToDelete = read(s);
        if (positionToDelete == null) {
            return false;
        }
        positionDB.remove(positionToDelete);
        return true;
    }

    @Override
    public List<Position> getAll() {
        return positionDB;
    }
}

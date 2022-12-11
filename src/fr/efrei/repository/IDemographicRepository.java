package fr.efrei.repository;

import fr.efrei.domain.Demographic;
import java.util.List;

public interface IDemographicRepository extends IRepository<Demographic, String>{
    public List<Demographic> getAll();
}

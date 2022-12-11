package fr.efrei.repository;

import fr.efrei.domain.Employees;
import java.util.List;

public interface IEmployeesRepository extends IRepository<Employees, String> {

    public List<Employees> getAll();
}


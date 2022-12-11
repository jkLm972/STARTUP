package fr.efrei.repository;

import fr.efrei.domain.Salary;
import java.util.List;

public interface ISalaryRepository extends IRepository<Salary, String> {

    public List<Salary> getAll();
}


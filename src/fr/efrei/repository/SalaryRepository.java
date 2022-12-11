package fr.efrei.repository;

import fr.efrei.domain.Salary;
import java.util.ArrayList;
import java.util.List;

public class SalaryRepository implements ISalaryRepository {
    private static SalaryRepository repository = null;
    private List<Salary> salariDB = null;

    private SalaryRepository() {
        salariDB = new ArrayList<Salary>();
    }

    public static SalaryRepository getRepository() {
        if (repository == null){
            return new SalaryRepository();
        }
        return repository;
    }

    @Override
    public Salary create(Salary salari) {
        boolean success = salariDB.add(salari);
        if (success){
            return salari;
        }
        else {
            return null;
        }
    }

    @Override
    public Salary read(String s) {
        for (Salary r : salariDB){
            if (r.getSalari().equals(s)){
                return r;
            }
        }
        return null;
    }
    

    @Override
    public Salary update(Salary salari) {
        Salary oldSalary = read(salari.getSalari());
        if (salari != null){
            salariDB.remove(oldSalary);
            salariDB.add(salari);
            return salari;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Salary salariToDelete = read(s);
        if (salariToDelete == null) {
            return false;
        }
        salariDB.remove(salariToDelete);
        return true;
    }

    @Override
    public List<Salary> getAll() {
        return salariDB;
    }
}
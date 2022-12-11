package fr.efrei.factory;

import fr.efrei.domain.Salary;
import fr.efrei.util.Helper;

public class SalaryFactory {
    public static Salary creatSalary(String salari){

        if (Helper.isNullOrEmpty(salari)){
            return null;
        }

        Salary salary = new Salary.Builder()
                .setSalari(salari)
                .build();
        
        return salary;
    }
}
package fr.efrei.factory;
import fr.efrei.domain.Employees;
import fr.efrei.util.Helper;
import java.util.*;
public class EmployeesFactory {

    public static Employees creatEmployees(String firstName, String lastName, int employeesNumber){
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(String.valueOf(employeesNumber)))  {
            return null;
        }
        Employees employees = new Employees.Builder()
                .setLastName(lastName)
                .setFirstName(firstName)
                .setEmployeesNumber(employeesNumber)
                .build();

        return employees;
    }

    public static Employees creatEmployees(int employeesNumber){
        if (Helper.isNullOrEmpty(String.valueOf(employeesNumber))){
            return null;
        }
        Employees employees = new Employees.Builder()
                .setEmployeesNumber(employeesNumber)
                .build();

        return employees;
    }

    public static Employees creatEmployees(String firstName, String lastName){
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) )  {
            return null;
        }
        Employees employees = new Employees.Builder()
                .setLastName(lastName)
                .setFirstName(firstName)
                .build();

        return employees;
    }

}
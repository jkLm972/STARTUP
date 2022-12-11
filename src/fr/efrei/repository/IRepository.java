package fr.efrei.repository;

public interface IRepository<T, ID> {
        //ID being the primary key, a String in the case of Race
        //generic and abstraction way
    T create(T t); //good habit to return the object to make sure it's well created
    T read(ID id);
    T update(T t);
    boolean delete(ID d); //delete by an ID, since it is a unique attribute

}

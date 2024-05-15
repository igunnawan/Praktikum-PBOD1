/*
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Penulis : Muhamad Gunawan / 24060122120016
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO; 
    }
}

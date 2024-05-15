/*
 * File : Person.java
 * Deskripsi : Person database model
 * Penulis : Muhamad Gunawan / 24060122120016
 */

public class Person {
    private int id;
    private String name;
    
    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

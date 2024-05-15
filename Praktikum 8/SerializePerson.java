import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Penulis : Muhamad Gunawan / 24060122120016
 */

class Person implements Serializable {
    private String name;
    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close(); 
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

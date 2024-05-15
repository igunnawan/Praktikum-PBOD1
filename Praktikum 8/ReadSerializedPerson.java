import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * File : ReadSerializedPerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Penulis : Muhamad Gunawan / 24060122120016
 */

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("Serialized person name = " + person.getName());
        }
        catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}

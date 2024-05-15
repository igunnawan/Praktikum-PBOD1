/*
 * File : MySQLPersonDAO.java
 * Deskripsi : Implementasi personDAO untuk MySQL
 * Penulis : Muhamad Gunawan / 24060122120016
 */

import java.sql.*;


public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "Str0ng!");

        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}

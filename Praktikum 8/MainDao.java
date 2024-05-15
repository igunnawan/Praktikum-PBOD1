

public class MainDao {
    public static void main(String[] args) {
        Person person = new Person("Joko");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

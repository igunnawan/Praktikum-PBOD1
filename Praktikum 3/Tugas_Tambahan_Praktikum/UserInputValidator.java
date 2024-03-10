package Tugas_Tambahan_Praktikum;
import java.util.regex.Pattern;

public class UserInputValidator {
    public static void validateUsername(String username) {
        char[] stringtochar = username.toCharArray();
        assert (stringtochar.length >= 5) : "Username must be at least 5 characters long";
        assert (stringtochar.length <= 20) : "Username must be at most 20 characters long";

        String regex = "[a-zA-Z][a-zA-Z0-9_]+";
        Pattern pattern = Pattern.compile(regex);
        assert (pattern.matcher(username).matches()) : "Invalid Username";
    }
    
    public static void validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        assert (pattern.matcher(email).matches()) : "Invalid email format";
    }
    
    public static void validateAge(int age) {
        assert (age >= 17 && age <= 99) : "Age must be between 17 and 99";
    }
}
      

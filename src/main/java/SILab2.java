import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) {
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";//A
        if (user==null) {//A
            throw new RuntimeException("The user is not instantiated");//B
        }
        if (user.getUsername()==null || user.getPassword()==null)//C
            throw new RuntimeException("The user is missing some mandatory information");//D
        String password = user.getPassword();//E
        String passwordLower = password.toLowerCase();//E
        if (passwordLower.contains(user.getUsername().toLowerCase())) {//E
            return false;//F
        }
        else if (passwordLower.length()<8)
            return false;//G
        else {
            boolean digit = false, upper = false, special = false;//J

            for (int i=0;i<password.length();i++) {//L
                if (Character.isDigit(password.charAt(i)))//M
                    digit = true;//P
                if (Character.isUpperCase(password.charAt(i)))//Q
                    upper = true;//R
                if (specialCharacters.contains(String.valueOf(password.charAt(i))))//S
                    special = true;//T
            }
            if (!digit || !upper || !special)//V
                return false;//X
        }
        return true;//Z
    }

}

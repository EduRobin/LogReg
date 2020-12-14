package cz.educanet.logreg;

public class User {

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String s, String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public String changeUsername(String newUsername){
        return this.username = newUsername;

    }
    public String changePassword(String newPassword){
        return this.username = newPassword;

    }

    public String renameUser(String newUsername) { return username = newUsername;}
}

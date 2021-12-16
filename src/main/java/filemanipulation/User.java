package filemanipulation;

public class User {
    private String userName;
    private String year;
    private String email;

    public User(String userName, String year, String email) {
        this.userName = userName;
        this.year = year;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }
}
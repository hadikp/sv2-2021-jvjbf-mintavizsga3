package filemanipulation;

public class User {

    private String userName;
    private String birthday;
    private String email;

    public User(String userName, String birthday, String email) {
        this.userName = userName;
        this.birthday = birthday;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

}

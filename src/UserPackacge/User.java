package UserPackacge;

import java.util.UUID;

public class User {
    private final java.util.UUID UUID = java.util.UUID.randomUUID(); //
    private String firstName;
    private String middleName;
    private String secondName;
    private String login;
    private String password;

    public User(String firstName, String middleName
            , String secondName, String login, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserPackacge.User: " +
                "UUID=" + UUID + "\'\n" +
                "FirstName='" + firstName + "\'\n"+
                "MiddleName='" + middleName +"\'\n" +
                "SecondName='" + secondName + "\'\n" +
                "Login='" + login + "\'\n" +
                "Password='" + password + "\'\n" +
                "\n";
    }
}

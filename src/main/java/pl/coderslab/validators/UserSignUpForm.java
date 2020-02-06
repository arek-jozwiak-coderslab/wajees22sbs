package pl.coderslab.validators;

import java.util.Objects;

@EqualPasswords
public class UserSignUpForm {

    private String login;
    private String password;
    private String confirmedPassword;

    public UserSignUpForm(String login, String password, String confirmedPassword) {
        Objects.requireNonNull(login);
        Objects.requireNonNull(password);
        Objects.requireNonNull(confirmedPassword);
        this.login = login;
        this.password = password;
        this.confirmedPassword = confirmedPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

}

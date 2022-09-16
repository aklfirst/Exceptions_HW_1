public class userId {

    private String login;
    private String password;
    private String confirmPassword;

    boolean a;


    public userId(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public boolean validCheck(String fieldCheck) {
        if (!fieldCheck.matches("\\w+")) {
            throw new WrongLoginException();
        }
        return a = true;
    }

    public boolean passwordLengthCheck(String fieldCheck) {
        if (fieldCheck.length() >= 20) {
            throw new WrongFieldLengthException();
        }
        return a = true;
    }

    public boolean loginLengthCheck(String fieldCheck) {
        if (fieldCheck.length() > 20) {
            throw new WrongFieldLengthException();
        }
        return a = true;
    }

    public boolean comparePasswords(String password1, String password2) {
        if (!password1.equals(password2)) {
            throw new WrongPasswordException();
        }
        return a = true;
    }

}

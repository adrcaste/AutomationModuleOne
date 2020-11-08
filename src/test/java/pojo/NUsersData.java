package pojo;

public class NUsersData {
    private String firstName;
    private String lastName;
    //private String email;
    private String telephone;
    private String password;
    private String confirmPassword;


    public NUsersData(String _firstName,
                       String _lastName,
                      // String _email,
                       String _telephone,
                       String _password,
                       String _confirmPassword){


        this.firstName = _firstName;
        this.lastName = _lastName;
        this.telephone = _telephone;
        this.password = _password;
        this.confirmPassword = _confirmPassword;
       // this.email=_email;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getTelephone() {
        return this.telephone;
    }
    public String getPassword() {
        return this.password;
    }
    public String getConfirmPassword() {
        return this.confirmPassword;
    }
    //public String getEmail() {
       // return this.email;
    //}
}



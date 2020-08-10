package ro.jademy.carrental.user;

public abstract class   User {

    private String firstName;
    private String lastName;
    private String useranme;
    private String password;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUseranme() {
        return useranme;
    }

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String firstName, String lastName, String useranme, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.useranme = useranme;
        this.password = password;
    }
}

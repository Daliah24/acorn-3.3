package Register_UI;

public class UserRegistrationData {
    private final String user;
    private final String pass;
    private final String fname;
    private final String lname;
    private final int age;
    private final String gender;
    private final String address;

    public UserRegistrationData(String user, String pass, String fname, String lname, int age, String gender, String address) {
        this.user = user;
        this.pass = pass;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Create getters for all the fields
    public String getUsername() {
        return user;
    }

    public String getPassword() {
        return pass;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
}

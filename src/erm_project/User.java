package erm_project;

public class User {
    private static int uniqueId = 0;
    private String address;
    private String email;
    private String mobile;
    private String lastName;
    private String firstName;
    private String password;
    private int userId;

    private BloodGroup bloodGroup;

    private Gender gender;

    public User(String firstName, String lastName, String mobile, String email,
                String address, String password) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.mobile=mobile;
        this.email = email;
        this.address = address;
        this.password = password;
        userId = ++uniqueId;

    }

    public User(String firstName, String lastName, String mobile, String email,
                String address) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.mobile=mobile;
        this.email = email;
        this.address = address;

        userId = ++uniqueId;

    }

    public static void setUniqueId() {
        uniqueId = 0;
    }

    public void editUserName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public String getName() {
        return firstName+ " " + lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getUserId() {
        return userId;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }
}

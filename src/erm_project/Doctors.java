package erm_project;

public class Doctors {
    private String firstName;
    private String lastName;
    private  int age;
    private int doctorId;
    private int idIncrement = 0;

    public Doctors(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.doctorId =++idIncrement;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getFirstName() {
        return firstName;
    }
}

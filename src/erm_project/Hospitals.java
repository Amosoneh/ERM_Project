package erm_project;

import java.util.ArrayList;

public class Hospitals {
    private final String hospitalName;
    private final String hospitalAddress;
    private ArrayList<Doctors> listOfDoctors = new ArrayList<>();
    private ArrayList<MedTest> listOfTests = new ArrayList<>();
    public Hospitals(String hospitalName, String hospitalAddress){
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;

    }

    public String getHospitalName() {
        return hospitalName;
    }

     public String getHospitalAddress() {
        return hospitalAddress;
    }

    public ArrayList<Doctors> getListOfDoctors() {
        return listOfDoctors;
    }

    public void addDoctor(String firstName, String lastName, int age) {
      Doctors doctor = new Doctors("firstName","lastName",age);
       listOfDoctors.add(doctor);
    }

    public ArrayList<MedTest> getListOfMedTests() {
        return listOfTests;
    }

    public void addMedTest(String test) {
        MedTest newTest = new MedTest("test");
        listOfTests.add(newTest);

    }
    public Doctors searchForDoctor(int id){
        int doctorlistIdex= -1;

        for (int d = 0; d<listOfDoctors.size(); d++){
            if(listOfDoctors.get(d).getDoctorId() == id){
                doctorlistIdex = d;
                break;
            }
        }
        if (doctorlistIdex == -1) {
            throw new IllegalArgumentException("Doctor Id " + id + " can't be found");
        }
        return listOfDoctors.get(doctorlistIdex);
    }

    public void sackDoctor(int id) {

        listOfDoctors.remove(searchForDoctor(id));
    }

    public MedTest searchForMedTest(int id){
        int indexOfMedTestToSearch = -1;
        for (int t =0; t < listOfTests.size();t++)
            if (listOfTests.get(t).getTestId() == id) {

                indexOfMedTestToSearch = t;
                break;
            }
        if (indexOfMedTestToSearch == -1)
            throw new IllegalArgumentException("MedTest Id " + id + " can't be found");
        return listOfTests.get(indexOfMedTestToSearch);



    }
    public void delistTest(int id) {
        listOfTests.remove(searchForMedTest(id));
    }
}

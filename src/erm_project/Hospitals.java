package erm_project;

import java.util.ArrayList;

public class Hospitals {
    private final String hospitalName;
    private final String hospitalAddress;
    private ArrayList<Doctors> listOfDoctors;
    private ArrayList<MedTest> listOfTests;
    public Hospitals(String hospitalName, String hospitalAddress){
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.listOfDoctors = new ArrayList<>();
        this.listOfTests = new ArrayList<>();
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

    public void addDoctor(Doctors doctor) {

       listOfDoctors.add(doctor);
    }

    public ArrayList<MedTest> getListOfMedTests() {
        return listOfTests;
    }

    public void addMedTest(MedTest medTest) {

        listOfTests.add(medTest);

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
        //this will return the index of the doctor to sack
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
        // also this return the index of medtest to list
        return listOfTests.get(indexOfMedTestToSearch);



    }
    public void delistTest(int id) {
        listOfTests.remove(searchForMedTest(id));
    }
}

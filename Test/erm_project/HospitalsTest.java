package erm_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HospitalsTest {
    Hospitals newHospital;

    @BeforeEach
    void setUp() {
        newHospital = new Hospitals("Semicolon Medical Center","123 New Road");
    }
    @Test
    void thatWeCanCreateANewHospitalTest(){
        assertEquals("Semicolon Medical Center",newHospital.getHospitalName());
        assertEquals("123 New Road",newHospital.getHospitalAddress());
    }
    @Test
    void thatWeCanAddDoctorToTheHospital(){
        newHospital.addDoctor("dan","omos", 25);

        assertEquals(1,newHospital.getListOfDoctors().size());
    }
    @Test
    void weCanSetTestAvailableToPerformInThisHospitalTest(){
        newHospital.addMedTest("malaria");
        assertEquals(1,newHospital.getListOfMedTests().size());
    }
    @Test
    void hospitalCanSackaDoctor(){
        newHospital.addDoctor("dan","omos", 25);
        newHospital.addDoctor("john","bull", 30);
        newHospital.sackDoctor(1);
        assertEquals(1,newHospital.getListOfDoctors().size());
    }
    @Test
    void hospitalCanDelistMedTest(){
        newHospital.addMedTest("malaria");
        newHospital.delistTest(1);
        assertEquals(0,newHospital.getListOfMedTests().size());
    }
}
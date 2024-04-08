package edu.wctc.part4;

import edu.wctc.part4.solution.HrPerson;

public class Company {
    private HumanResourcesPerson hr;

    public Company() {
        hr = new HumanResourcesPerson();
    }

    public void hireEmployee(String firstName, String lastName, String ssn){
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }
}

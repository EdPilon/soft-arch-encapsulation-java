package edu.wctc.part4;

import java.util.ArrayList;

public class HumanResourcesPerson {

    private ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public HumanResourcesPerson(){

    }

    public void hireEmployee(String firstName, String lastName, String ssn){
        Employee employee = new Employee(firstName, lastName, ssn);
        employeeList.add(employee);
    }

    private void orientEmployee(edu.wctc.part4.Employee employee) {
        employee.doFirstTimeOrientation("e205");
    }
    public void outputReport(String ssn) {

        // find employee in list
        for (edu.wctc.part4.Employee employee : employeeList) {
            if (employee.getSsn().equals(ssn)) {
                // if found run report
                if (employee.hasMetWithHr() && employee.hasMetDeptStaff()
                        && employee.hasReviewedDeptPolicies() && employee.hasMovedIn()) {
                    employee.printReport();
                }
                break;
            }
        }
    }
}

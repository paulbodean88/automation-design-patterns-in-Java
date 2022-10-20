package main.srp.employeeExample;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

//    public boolean isPromotionDueThisYear() {
//        return true;
//    }
//
//    public double calcIncomeTaxForCurrentYear() {
//        return 11;
//    }
}

package org.example.arutala.sallary.karyawan.model;

public class Employee extends Person implements Calculation {
    private String employeeId;
    private double salary;
    private String jobDesc;
    private Placement placement;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public Placement getPlacement() {
        return placement;
    }


    public Employee(String employeeId, String name, String address, int age, String jobDesc, Placement placement, double salary) {
        super(name, address, age);
        this.employeeId = employeeId;
        this.salary = salary;
        this.jobDesc = jobDesc;
        this.placement = placement;
        calculationSalary();
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
        calculationSalary();
    }

    @Override
    public void calculationSalary() {
        this.salary = placement.getUmk();
    }

    @Override
    public void calculationAllowance() {

    }

}

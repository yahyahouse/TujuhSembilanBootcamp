package org.example.arutala.sallary.karyawan.model;

public class Analyst extends Employee{
    private double allowance;

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public Analyst(String employeeId, String name, String address, int age, String jobDesc, Placement placement, double allowance, double salary) {
        super(employeeId, name, address, age, jobDesc, placement, salary);
        this.allowance = allowance;
        calculationAllowance();
        calculationSalary();
    }

    @Override
    public void calculationSalary() {
        setSalary(getPlacement().getUmk()+getPlacement().getUmk()*0.6);
    }
    @Override
    public void calculationAllowance() {
        this.allowance = 0.05 * getSalary();
    }
}

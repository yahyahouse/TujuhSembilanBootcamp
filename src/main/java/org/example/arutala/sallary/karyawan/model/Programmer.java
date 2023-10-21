package org.example.arutala.sallary.karyawan.model;

public class Programmer extends Employee{
    private String programmingLanguage;
    private int experiences;
    private double allowance;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getExperiences() {
        return experiences;
    }

    public void setExperiences(int experiences) {
        this.experiences = experiences;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public Programmer(String employeeId, String name, String address, int age, String jobDesc, Placement placement, String programmingLanguage, int experiences, double allowance,double salary) {
        super(employeeId, name, address, age, jobDesc, placement, salary);
        this.programmingLanguage = programmingLanguage;
        this.experiences = experiences;
        this.allowance = allowance;
        calculationSalary();
        calculationAllowance();
    }

    @Override
    public void calculationSalary() {
        setSalary(getPlacement().getUmk()+getPlacement().getUmk()*0.5);
    }

    @Override
    public void calculationAllowance() {
        if (experiences > 4) {
            this.allowance = 0.2 * getSalary();
        } else {
            this.allowance = 0.1 * getSalary();
        }
    }
}

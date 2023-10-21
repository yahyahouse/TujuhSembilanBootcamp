package org.example.arutala.sallary.karyawan.model;

public class ProjectLeader extends Employee{
    private int totalProjects;
    private double allowance;

    public int getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(int totalProjects) {
        this.totalProjects = totalProjects;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public ProjectLeader(String employeeId, String name, String address, int age, String jobDesc, Placement placement, double salary, int totalProjects, double allowance) {
        super(employeeId, name, address, age, jobDesc, placement, salary);
        this.totalProjects = totalProjects;
        this.allowance = allowance;
        calculationAllowance();
        calculationSalary();
    }

    @Override
    public void calculationSalary() {
        setSalary(getPlacement().getUmk()+getPlacement().getUmk()*1);
    }
    @Override
    public void calculationAllowance() {
        if (totalProjects >= 2) {
            this.allowance = 0.15 * getSalary();
        } else {
            this.allowance = 0.05 * getSalary();
        }
    }
}

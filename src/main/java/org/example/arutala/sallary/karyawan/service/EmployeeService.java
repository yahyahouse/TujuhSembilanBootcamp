package org.example.arutala.sallary.karyawan.service;

import org.example.arutala.sallary.karyawan.model.*;
import org.example.arutala.sallary.karyawan.repository.RepositoryEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private RepositoryEmployee repositoryEmployee = new RepositoryEmployee();


    public void addEmployee(Employee employee) {
        repositoryEmployee.getAllEmployee().add(employee);
    }

    public List<Employee> getAllDataEmployee() {
        return repositoryEmployee.getAllEmployee();
    }

    public void editEmployeePlacement(String employeeId, Placement newPlacement) {
        repositoryEmployee.getAllEmployee().stream()
                .filter(employee -> employee.getEmployeeId().equals(employeeId))
                .findFirst()
                .ifPresent(employee -> {
                    employee.setPlacement(newPlacement);
                    employee.calculationSalary();
                });
    }

    public void deleteEmployee(String employeeId) {
        repositoryEmployee.getAllEmployee()
                .removeIf(employee -> employee.getEmployeeId().equals(employeeId));
    }

    public List<Employee> searchEmployeesByPlacement(Placement placement) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : repositoryEmployee.getAllEmployee()) {
            if (employee.getPlacement() == placement) {
                result.add(employee);
            }
        }
        return result;
    }

    public boolean isEmployee(String employeeID){
        return repositoryEmployee.getAllEmployee()
                .stream()
                .anyMatch(employee -> employee.getEmployeeId().equals(employeeID));
    }
    public double calculatePayRoll(){
        double totalPayRoll = 0;
        double allowance = 0.0;
        for (Employee employee:repositoryEmployee.getAllEmployee()) {
            if (employee instanceof Programmer) {
                Programmer programmer = (Programmer) employee;
                allowance = programmer.getAllowance();
            } else if (employee instanceof ProjectLeader) {
                ProjectLeader projectLeader = (ProjectLeader) employee;
                allowance = projectLeader.getAllowance();
            } else if (employee instanceof Analyst) {
                Analyst analyst = (Analyst) employee;
                allowance = analyst.getAllowance();
            }
            totalPayRoll+=employee.getSalary()+ allowance;

        }
        return totalPayRoll;
    }
}

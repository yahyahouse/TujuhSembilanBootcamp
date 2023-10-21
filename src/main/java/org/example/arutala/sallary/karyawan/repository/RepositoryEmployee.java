package org.example.arutala.sallary.karyawan.repository;

import org.example.arutala.rental.buku.model.BookForLoan;
import org.example.arutala.sallary.karyawan.model.*;

import java.util.ArrayList;
import java.util.List;

public class RepositoryEmployee {
    private List<Employee> employees;
    public RepositoryEmployee() {
        employees = new ArrayList<>();
        initializeDummyData();
    }
    public List<Employee> getAllEmployee() {
        return employees;
    }
    public void initializeDummyData() {
        employees = new ArrayList<>();
        employees.add(new Employee("Emp-001","Susi","Bandung",27,"Admin", Placement.JAKARTA,0));
        employees.add(new Employee("Emp-002","Anto","Bandung",35,"Office Boy", Placement.BANDUNG,0));
        employees.add(new Employee("Emp-003","Riman","Jakarta",28,"Human Resource Dev", Placement.BANDUNG,0));

        employees.add(new Programmer("Prog-001","Budi", "Bandung", 25, "Back End Dev", Placement.JAKARTA,"Java",2,0,0));
        employees.add(new Programmer("Prog-002","Ani", "Bandung", 30, "Front End Dev", Placement.BANDUNG,"React Js",6,0,0));
        employees.add(new Programmer("Prog-003","Ujang", "Jakarta", 28, "Full Stack Dev", Placement.BANDUNG,"Kotlin",4,0,0));

        employees.add((new ProjectLeader("PL-001","Ahmad","Bandung",25,"Project Leader", Placement.GARUT,2,0,0)));
        employees.add((new ProjectLeader("PL-002","Dani","Bandung",30,"Scrum Master", Placement.BEKASI,1,0,0)));
        employees.add((new ProjectLeader("PL-003","Cecep","Jakarta",28,"Jakarta", Placement.BOGOR,4,0,0)));

        employees.add(new Analyst("AL-001", "Indah", "Garut", 25, "Analyst", Placement.JAKARTA,0,0));
        employees.add(new Analyst("AL-002", "Puspa", "Bandung", 30, "Analyst", Placement.BEKASI,0,0));
        employees.add(new Analyst("AL-003", "Sari", "Jakarta", 28, "Analyst", Placement.BOGOR,0,0));

    }
}

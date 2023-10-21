package org.example.arutala.sallary.karyawan.controller;

import org.example.arutala.sallary.karyawan.model.*;
import org.example.arutala.sallary.karyawan.service.EmployeeService;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuController {
    private EmployeeService employeeService = new EmployeeService();
    private Scanner scanner = new Scanner(System.in);

    public void menuUtama() throws Exception {
        System.out.println("Selamat Datang di Aplikasi Pendataan Karyawan PT. Secret Semut 79");
        String choice;
        boolean exit = false;
        try {

            while (!exit) {
                System.out.println("\nMenu:");
                System.out.println("1. Add Employee");
                System.out.println("2. Edit Employee");
                System.out.println("3. Data Employee");
                System.out.println("4. Data Payroll");
                System.out.println("5. Delete Employee");
                System.out.println("6. Searching");
                System.out.println("0. Exit");
                System.out.print("Pilih menu (0-6): ");

                choice = scanner.next();
                scanner.nextLine();

                switch (choice) {
                    case "1":
                        menuAddEmpoleyee();
                        break;
                    case "2":
                        menuEditEmployee();
                        break;
                    case "3":
                        menuDataEmployee();
                        break;
                    case "4":
                        menuDataPayRoll();
                        break;
                    case "5":
                        menuDeleteEmployee();
                        break;
                    case "6":
                        menuSearchingEmployee();
                        break;
                    case "0":
                        System.out.println("Terima kasih, program selesai.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                }
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void menuAddEmpoleyee() throws Exception {
        try {
            System.out.println("Pilih jenis karyawan:");
            System.out.println("1. Employee");
            System.out.println("2. Programmer");
            System.out.println("3. ProjectLeader");
            System.out.println("4. Analyst");
            System.out.print("Pilih jenis karyawan (1-4): ");
            int employeeType = scanner.nextInt();
            scanner.nextLine();
            System.out.print("EmployeeId: ");
            String employeeId = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("JobDesc: ");
            String jobDesc = scanner.nextLine();
            System.out.print("Placement (GARUT, BANDUNG, JAKARTA, BEKASI, BOGOR): ");
            Placement placement = Placement.valueOf(scanner.nextLine());
            if (employeeService.isEmployee(employeeId)) {
                System.out.println("EmployeeId sudah digunakan. Silakan masukkan EmployeeId yang berbeda.");
            } else {
                if (employeeType == 1) {
                    // Employee
                    employeeService.addEmployee(new Employee(employeeId, name, address, age, jobDesc, placement, 0));

                } else if (employeeType == 2) {
                    // Programmer
                    System.out.print("Programming Language: ");
                    String programmingLanguage = scanner.nextLine();
                    System.out.print("Experiences (years): ");
                    int experience = scanner.nextInt();
                    scanner.nextLine();
                    employeeService.addEmployee(new Programmer(employeeId, name, address, age, jobDesc, placement, programmingLanguage, experience, 0, 0));
                } else if (employeeType == 3) {
                    // ProjectLeader
                    System.out.print("Total Project: ");
                    int totalProject = scanner.nextInt();
                    scanner.nextLine();
                    employeeService.addEmployee(new ProjectLeader(employeeId, name, address, age, jobDesc, placement, totalProject, 0, 0));
                } else if (employeeType == 4) {
                    // Analyst
                    employeeService.addEmployee(new Analyst(employeeId, name, address, age, jobDesc, placement, 0, 0));
                }
                System.out.println("Karyawan baru berhasil ditambahkan.");
            }
        } catch (Exception e) {
            throw new Exception("Input Tidak Valid");
        } finally {
            System.out.println("Input Tidak Valid");
            menuUtama();
        }
    }

    public void menuDataEmployee() {
        String[] displayTampilan = {
                "No",
                "Employee Id",
                "Name",
                "Address",
                "Age",
                "Job Desc",
                "Placement",
        };
        AtomicInteger no = new AtomicInteger(1);
        System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+");
        System.out.printf("| %-2s | %-11s | %-11s | %-11s | %-5s | %-20s | %-10s |\n", displayTampilan);
        System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+");
        employeeService.getAllDataEmployee().forEach(employees -> {
            String[] displayValues = {
                    String.valueOf(no.getAndIncrement()),
                    employees.getEmployeeId(),
                    employees.getName(),
                    employees.getAddress(),
                    String.valueOf(employees.getAge()),
                    employees.getJobDesc(),
                    String.valueOf(employees.getPlacement())
            };
            System.out.printf("| %-2s | %-11s | %-11s | %-11s | %-5s | %-20s | %-10s |\n", displayValues);
        });
        System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+");

    }

    public void menuDataPayRoll() {
        String[] displayTampilan = {
                "No",
                "Employee Id",
                "Name",
                "Job Desc",
                "Placement",
                "Allowanace",
                "Salary",
        };
        AtomicInteger no = new AtomicInteger(1);
        System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+------------+");
        System.out.printf("| %-2s | %-11s | %-11s | %-20s | %-9s | %-20s | %-10s |\n", displayTampilan);
        System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+------------+");
        employeeService.getAllDataEmployee().forEach(employees -> {
            double allowance = 0.0;
            if (employees instanceof Programmer) {
                Programmer programmer = (Programmer) employees;
                allowance = programmer.getAllowance();
            } else if (employees instanceof ProjectLeader) {
                ProjectLeader projectLeader = (ProjectLeader) employees;
                allowance = projectLeader.getAllowance();
            } else if (employees instanceof Analyst) {
                Analyst analyst = (Analyst) employees;
                allowance = analyst.getAllowance();
            }
            String[] displayValues = {
                    String.valueOf(no.getAndIncrement()),
                    employees.getEmployeeId(),
                    employees.getName(),
                    employees.getJobDesc(),
                    String.valueOf(employees.getPlacement()),
                    String.valueOf(allowance),
                    String.valueOf(employees.getSalary())
            };
            System.out.printf("| %-2s | %-11s | %-11s | %-20s | %-9s | %-20s | %-10s |\n", displayValues);
        });
        double totalPayroll = employeeService.calculatePayRoll();
        System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+------------+");
        System.out.printf("| %-2s | Total Payroll | %.2f |\n", no.getAndIncrement(), totalPayroll);
        System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+------------+");
    }

    public void menuEditEmployee() throws Exception {
        try {

            System.out.print("EmployeeId: ");
            String employeeId = scanner.nextLine();
            System.out.print("Placement (GARUT, BANDUNG, JAKARTA, BEKASI, BOGOR): ");
            Placement placement = Placement.valueOf(scanner.nextLine());
            if (!employeeService.isEmployee(employeeId)) {
                System.out.println("Employee tidak ditemukan");
            }
            employeeService.editEmployeePlacement(employeeId, placement);
        } catch (Exception e) {
            throw new Exception("Input Tidak Valid");
        } finally {
            System.out.println("Input Tidak Valid");
            menuUtama();
        }
    }

    public void menuDeleteEmployee() {
        System.out.print("EmployeeId: ");
        String employeeId = scanner.nextLine();
        if (!employeeService.isEmployee(employeeId)) {
            System.out.println("Employee tidak ditemukan");
        } else {
            employeeService.deleteEmployee(employeeId);
        }
    }

    public void menuSearchingEmployee() throws Exception {
        try {
            System.out.println("Searching Data Karyawan");
            System.out.println("\n1. Search By Placement");
            System.out.println("0. Back To Main Menu");

            System.out.print("Pilih menu (0-1): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Placement (GARUT, BANDUNG, JAKARTA, BEKASI, BOGOR): ");
                    Placement placement = Placement.valueOf(scanner.nextLine());
                    searchByPenempatan(placement);
                    break;
                case 0:
                    menuUtama();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                    break;
            }
        } catch (Exception e) {
            throw new Exception("input tidak valid");
        } finally {
            System.out.println("Input Tidak Valid");
            menuUtama();
        }
    }

    public void searchByPenempatan(Placement placement) throws Exception {
        try {

            String[] displayTampilan = {
                    "No",
                    "Employee Id",
                    "Name",
                    "Address",
                    "Age",
                    "Job Desc",
                    "Placement",
            };
            AtomicInteger no = new AtomicInteger(1);
            System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+------------+");
            System.out.printf("| %-2s | %-11s | %-11s | %-11s | %-5s | %-20s | %-10s |\n", displayTampilan);
            System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+------------+");
            List<Employee> employeesByPlacement = employeeService.searchEmployeesByPlacement(placement);

            if (employeesByPlacement.isEmpty()) {
                System.out.println("Tidak ada karyawan dengan penempatan " + placement);
            } else {
                employeesByPlacement.forEach(employees -> {
                    String[] displayValues = {
                            String.valueOf(no.getAndIncrement()),
                            employees.getEmployeeId(),
                            employees.getName(),
                            employees.getAddress(),
                            String.valueOf(employees.getAge()),
                            employees.getJobDesc(),
                            String.valueOf(employees.getPlacement())
                    };
                    System.out.printf("| %-2s | %-11s | %-11s | %-11s | %-5s | %-20s | %-10s |\n", displayValues);
                });
            }
            System.out.println("+----+-------------+-------------+----------------------+-----------+----------------------+------------+");
        } catch (Exception e) {
            throw new Exception("input tidak valid");
        } finally {
            System.out.println("Input Tidak Valid");
            menuUtama();
        }
    }

}


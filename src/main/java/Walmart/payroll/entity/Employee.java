package Walmart.payroll.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id=0;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_surname")
    private String surName;

    @Column(name = "employee_email")
    private String email;

    @Column(name = "phone_number")
    private String phone;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Column(name = "employee_address")
    private String address;

    @Column(name = "employee_salary")
    private double salary;

    public Employee(int id, String name, String surName, String email, String phone, String address, double salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
/*
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

 */
}

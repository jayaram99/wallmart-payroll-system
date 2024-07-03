package Walmart.payroll.DTO;

public class EmployeeDTO {
    private int id=0;
    private String name;
    private String surName;
    private String email;
    private String phone;
    private String address;
    private int salary;

    public EmployeeDTO(){

    }
    public EmployeeDTO(int id, String name, String surName, String email, String phone, String address, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getsurName() {
        return surName;
    }

    public void setsurName(String surName) {
        this.surName = surName;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

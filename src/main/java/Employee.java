import java.sql.Date;

public class Employee {

    int employeeID;
    String name;
    String surname;
    String email;
    String phoneNumber;
    Date hireDate;
    int jobID;
    int salary;
    int comissionPCT;
    int managerID;
    int departmentID;

    public Employee(int employeeID, String name, String surname, String email, String phoneNumber, Date hireDate,
                    int jobID, int salary, int comissionPCT, int managerID, int departmentID) {
        this.employeeID = employeeID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobID = jobID;
        this.salary = salary;
        this.comissionPCT = comissionPCT;
        this.managerID = managerID;
        this.departmentID = departmentID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setComissionPCT(int comissionPCT) {
        this.comissionPCT = comissionPCT;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public int getJobID() {
        return jobID;
    }

    public int getSalary() {
        return salary;
    }

    public int getComissionPCT() {
        return comissionPCT;
    }

    public int getManagerID() {
        return managerID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", jobID=" + jobID +
                ", salary=" + salary +
                ", comissionPCT=" + comissionPCT +
                ", managerID=" + managerID +
                ", departmentID=" + departmentID +
                '}';
    }
}

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private int code;
    private long salaryrate;
    public Employee(int id, String name, int age, String department, int code, long salaryrate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryrate = salaryrate;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    public int getCode() {
        return code;
    }
    public long getSalaryrate() {
        return salaryrate;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setSalaryrate(long salaryrate) {
        this.salaryrate = salaryrate;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department + ", Code: " + code + ", Salary: " + salaryrate;
    }
}



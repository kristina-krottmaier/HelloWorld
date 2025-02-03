// Subklasse Employee, die von Person erbt
class Employee extends Person {
    private String employeeId;
    private String supervisorId;
    private double salary;

    // Konstruktor
    public Employee(String name, String firstName, int age, String employeeId, String supervisorId, double salary) {
        super(name, firstName, age);
        this.employeeId = employeeId;
        this.supervisorId = supervisorId;
        this.salary = salary;
    }
    //Setter für employeeid salery und supervisorid
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    // Methode zur Gehaltserhöhung
    public void salaryIncrease(float percentage) {
        this.salary += this.salary * (percentage / 100);
    }

    // Methode zum Drucken aller Informationen
    public void printAll() {
        System.out.println("Name: " + fullName());
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Supervisor ID: " + supervisorId);
        System.out.printf("Salary: %.2f", salary);
    }
}
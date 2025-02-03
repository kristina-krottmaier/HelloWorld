public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Marton", "Blake", 17, "E12345", "S5678", 55555);
        emp.printAll();

        System.out.println("\nNach Gehaltserhöhung um 10%:");
        emp.salaryIncrease(10);
        emp.printAll();
    }
}
package academy.learnprogramming.methods;

public class DataEncapsulation {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("MyCompany"); 
        // company.addEmployee.add("John");
        company.addEmployee("John");
        company.addEmployee("Anthony");
        company.addEmployee(null);
        company.addEmployee("");

        company.setName(null);

        company.printSorter();
        // company.name = null;
        // company.printSorter();

        // company.employees = null;
        // company.employees.add("Jimmy");
        // company.printSorter();
    }
}

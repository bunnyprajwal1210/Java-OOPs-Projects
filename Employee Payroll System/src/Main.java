public class Main {
    public static void main(String[] args) {
        PayRoll payRoll = new PayRoll();
        FullTimeEmployee emp1 = new FullTimeEmployee("Bunny", 1, 75000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Prajwal", 2, 50, 1000);

        payRoll.addEmployee(emp1);
        payRoll.addEmployee(emp2);
        System.out.println("Employees Details: ");
        payRoll.displayEmployees();
        System.out.println();
        payRoll.removeEmployee(2);
        System.out.println();
        System.out.println("Remaining Employees Details: ");
        payRoll.displayEmployees();
    }
}
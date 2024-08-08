class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double rateForHour;

    public PartTimeEmployee(String name, int id, int hoursWorked, double rateForHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.rateForHour = rateForHour;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * rateForHour;
    }
}
import java.util.ArrayList;
import java.util.List;

class PayRoll{
    private ArrayList<Employee> employeeList;

    public PayRoll(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee: employeeList){
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            }
        }
        if(employeeToRemove != null){
            System.out.println("Removing Employee: Id = " + employeeToRemove.getId() + ", Name = " + employeeToRemove.getName());
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
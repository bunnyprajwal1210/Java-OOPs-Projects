import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements untility{
    String emp_id;
    String emp_name;
    String emp_dept;
    int emp_age;

    @Override
    public void get_details(){
        System.out.println("The Employee ID is: " +emp_id);
        System.out.println("The Employee Name is: " +emp_name);
        System.out.println("The Employee Department is: " +emp_dept);
        System.out.println("The Employee Age is: " +emp_age);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.println("Employee Name: ");
        emp_name = sc.nextLine();
        System.out.println("Employee Department: ");
        emp_dept = sc.nextLine();
        System.out.println("Employee Age: ");
        emp_age = sc.nextInt();
    }
}

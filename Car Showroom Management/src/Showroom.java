import java.sql.SQLOutput;
import java.util.Scanner;

public class Showroom implements untility{
    String showroom_name;
    String showroom_address;
    int total_no_cars=0;
    int total_employees;
    String manager_name;

    @Override
    public void get_details(){
        System.out.println("The Showroom Name is: " +showroom_name);
        System.out.println("The Showroom Address is: " +showroom_address);
        System.out.println("The Manager Name is:" +manager_name);
        System.out.println("The Total Number of Employees: " +total_employees);
        System.out.println("The Total Number oc Cars in Showroom are:" +total_no_cars);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.println("Showroom Name: ");
        showroom_name = sc.nextLine();
        System.out.println("Showroom Address: ");
        showroom_address = sc.nextLine();
        System.out.println("Manager Name: ");
        manager_name = sc.nextLine();
        System.out.println("Total Number of Employees");
        total_employees = sc.nextInt();
        System.out.println("Total Number Cars: ");
        total_no_cars = sc.nextInt();
    }

}

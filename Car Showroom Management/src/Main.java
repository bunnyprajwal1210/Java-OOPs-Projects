import java.util.*;
import java.lang.*;

interface untility{
   public void get_details();
   public void set_details();

}

public class Main {

        static void main_menu(){
            System.out.println();
            System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
            System.out.println();
            System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
            System.out.println();
            System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
            System.out.println();
            System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
            System.out.println();
            System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

        }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Cars car[] = new Cars[5];
            Showroom showroom[] = new Showroom[5];
            Employees employee[] = new Employees[5];
            int showroom_count=0;
            int emp_count=0;
            int car_count=0;
            int choice=100;

            while(choice !=0){
                main_menu();
                System.out.println("Enter Your Choice: ");
                choice = sc.nextInt();

                while (choice !=9 && choice !=0){
                    switch (choice) {
                        case 1:
                            showroom[showroom_count] = new Showroom();
                            showroom[showroom_count].set_details();
                            showroom_count++;
                            System.out.println();
                            System.out.println("1].ADD NEW SHOWROOM");
                            System.out.println("9].GO BACK TO MAIN MENU");
                            choice = sc.nextInt();
                            break;
                        case 2:
                            employee[emp_count] = new Employees();
                            employee[emp_count].set_details();
                            emp_count++;
                            System.out.println();
                            System.out.println("2].ADD NEW EMPLOYEE");
                            System.out.println("9].GO BACK TO MAIN MENU");
                            choice = sc.nextInt();
                            break;
                        case 3:
                            car[car_count] = new Cars();
                            car[car_count].set_details();
                            car_count++;
                            System.out.println();
                            System.out.println("3].ADD NEW CAR");
                            System.out.println("9].GO BACK TO MAIN MENU");
                            choice = sc.nextInt();
                            break;
                        case 4:
                            if (showroom_count > 0) {
                                for (int i = 0; i <= showroom_count; i++) {
                                    if (showroom[i] != null) {
                                        showroom[i].get_details();
                                        System.out.println();
                                    }
                                }
                            }else {
                                    System.out.println("NO SHOWROOMS TO SHOW");
                                }
                            System.out.println();
                            System.out.println("9].GO BACK TO MAIN MENU");
                            System.out.println("0].EXIT");
                            choice = sc.nextInt();
                            break;
                        case 5:
                            if (emp_count > 0) {
                                for (int i = 0; i <= emp_count; i++) {
                                    if (employee[i] != null) {
                                        employee[i].get_details();
                                        System.out.println();
                                    }
                                }
                            }else{
                                    System.out.println("NO EMPLOYEES TO SHOW");
                                }
                            System.out.println();
                            System.out.println("9].GO BACK TO MAIN MENU");
                            System.out.println("0].EXIT");
                            choice = sc.nextInt();
                            break;
                        case 6:
                            if (car_count > 0) {
                                for (int i = 0; i <= car_count; i++) {
                                    if (car[i] != null) {
                                        car[i].get_details();
                                        System.out.println();
                                    }
                                }
                            }else {
                                    System.out.println("NO CARS TO SHOW");
                                }
                            System.out.println();
                            System.out.println("9].GO BACK TO MAIN MENU");
                            System.out.println("0].EXIT");
                            choice = sc.nextInt();
                            break;
                        default:
                            System.out.println("ENTER A VALID CHOICE: ");
                            break;
                    }
                }
            }
    }
}
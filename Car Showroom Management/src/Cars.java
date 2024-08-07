import java.sql.SQLOutput;
import java.util.Scanner;

public class Cars extends Showroom implements untility{
    String car_name;
    String car_color;
    String fuel_type;
    int car_price;
    String car_transmission;

    @Override
    public void get_details(){
        System.out.println("The Car Name is: " +car_name);
        System.out.println("The Car Color is: " +car_color);
        System.out.println("The Car Price is: " +car_price);
        System.out.println("The Car Fuel Type is: " +fuel_type);
        System.out.println("The Car Transmission mode is: " +car_transmission);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.println("Car Name: ");
        car_name = sc.nextLine();
        System.out.println("Car Color: ");
        car_color = sc.nextLine();
        System.out.println("Car Price: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.println("Car Fuel Type: ");
        fuel_type = sc.nextLine();
        System.out.println("Car Transmission Mode: ");
        car_transmission = sc.nextLine();
    }
}

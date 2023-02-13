
import java.util.Scanner;

public class CarRentalProcedural {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of days you want to rent the car: ");
    int numOfDays = input.nextInt();
    int rentalFee = numOfDays * 40;

    System.out.println("The rental fee for " + numOfDays + " days is $" + rentalFee);
  }
}


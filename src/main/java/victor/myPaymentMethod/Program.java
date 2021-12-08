package victor.myPaymentMethod;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        PaymentDataAccess dataAccess = new PaymentDataAccess();
        int option = 1;//random initialized to enter the loop

        while(true && option!=0){
            System.out.println("Please select the next action");
            System.out.println("1.Print all payments");
            System.out.println("2.Print a payment by Id");
            System.out.println("3.Delete payment");
            System.out.println("0.Exit Program");

            option = getOption();

            switch (option){
                case 1:
                    //see below how payments from PaymentDataAccess will be accessed
                    System.out.println(PaymentDataAccess.getPayments());
                    //fix the issue -> print each field;
                    break;
                case 2:
                    //your code;
                    break;
                case 3:
                    //your code;
                case 0:
                    option = 0;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    private static int getOption(){
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Choose an action: " );
        return myInput.nextInt();
    }
}

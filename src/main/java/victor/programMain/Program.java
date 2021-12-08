package victor.programMain;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        List<Payment> payments = initPayments();

        //TODO:Implement printPayments(payments) and the code where it is called (line 13, 23)


        //TODO:For Payment with ID=1 -> Set IsSuccess = true

        //TODO:For Payment with ID=2 -> Set IsCancel = true


        printPayments(payments);
        chancePaymentIsSuccess(payments);
        printPayments(payments);
        changePaymentIsCancel(payments);
        changePaymentIsCancel(payments);
        printPayments(payments);

    }

    private static void changePaymentIsCancel(List<Payment> payments) {

        for(Payment payment : payments){
            if(payment.getId()==2){
                payment.setCancel(true);
            }
        }
    }


    private static void chancePaymentIsSuccess(List<Payment> payments) {

        for(Payment payment : payments){
            if(payment.getId()==1){
                payment.setSuccess(true);

            }
        }

    }

    //print all payments
    private static void printPayments(List<Payment> payments) {

        System.out.println("----------------------");
        for (Payment payment : payments){
            System.out.println(payment.toString());
        }
    }


    //leave this method;
    private static List<Payment> initPayments(){
        List<Payment> payments =  new ArrayList<>();
        payments.add(new Payment(1,100,"EUR",false,false));
        payments.add(new Payment(2,150,"EUR", false, false));
        payments.add(new Payment(3,500,"RON",false  ,false));

        return payments;
    }
}

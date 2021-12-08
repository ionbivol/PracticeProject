package victor.myPaymentMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaymentDataAccess {
    static ArrayList<Payment> payments;

    public PaymentDataAccess() {
        List<Integer> ints = Arrays.asList(1,2,3);
        this.payments = new ArrayList<>();
        payments.add(new Payment(1,100,"RON"));
        payments.add(new Payment(2,150,"RON"));
        payments.add(new Payment(3,200,"RON"));
    }

    public static ArrayList<Payment> getPayments() {
        return payments;
    }
}

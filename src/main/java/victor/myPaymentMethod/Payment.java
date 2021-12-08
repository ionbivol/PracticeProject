package victor.myPaymentMethod;

public class Payment {
    //Id = 1,
    //Amount = 100;
    //Currency = "RON"/"EUR"
    public int Id;
    public int Amount;
    public String Currency;

    public Payment(int id, int amount, String currency){
        Id = id;
        Amount = amount;
        Currency = currency;
    }
}

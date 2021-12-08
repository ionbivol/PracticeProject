package victor.programMain;

public class Payment {

    private int Id;
    private int Amount;
    private String Currency;
    private boolean IsSuccess;
    private boolean IsCancel;

    protected Payment(int id, int amount, String currency, boolean isSuccess, boolean isCancel) {
        Id = id;
        Amount = amount;
        Currency = currency;
        IsSuccess = isSuccess;
        IsCancel = isCancel;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public boolean isSuccess() {
        return IsSuccess;
    }

    public void setSuccess(boolean success) {
        IsSuccess = success;
    }

    public boolean isCancel() {
        return IsCancel;
    }

    public void setCancel(boolean cancel) {
        IsCancel = cancel;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "Id=" + Id +
                ", Amount=" + Amount +
                ", Currency='" + Currency + '\'' +
                ", IsSuccess=" + IsSuccess +
                ", IsCancel=" + IsCancel +
                '}';
    }
}

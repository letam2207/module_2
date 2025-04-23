package case_study.entity;

public class Contract extends Booking {
     int numberContract;
     int money;
     int deposit;
     int totalPayment;

    public Contract() {
    }

    public Contract(int numberContract, int money,
                    int deposit, int totalPayment,int bookingId) {
        super(bookingId);
        this.numberContract = numberContract;
        this.money = money;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }
}

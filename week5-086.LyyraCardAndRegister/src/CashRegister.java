
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double economicalPrice = 2.50;
    private final double gourmetPrice = 4.00;


    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        if (cashGiven >= economicalPrice) {
            cashInRegister += economicalPrice;
            economicalSold++;
            return cashGiven - economicalPrice;
        } else {
            // if not enough money given, all is returned and nothing else happens
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        if (cashGiven >= gourmetPrice) {
            cashInRegister += gourmetPrice;
            gourmetSold++;
            return cashGiven - gourmetPrice;
        } else {
            // if not enough money given, all is returned and nothing else happens
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= economicalPrice) {
            card.pay(economicalPrice);
            economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= gourmetPrice) {
            card.pay(gourmetPrice);
            gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0.0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}

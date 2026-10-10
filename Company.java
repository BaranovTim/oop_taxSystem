import taxes.TaxSystem;

public class Company {
    public String title;
    private int debit;
    private int credit;
    protected TaxSystem TaxSystem;

    public Company(String title, TaxSystem TaxSystem) {
        this.title = title;
        this.TaxSystem = TaxSystem;
        this.debit = 0;
        this.credit = 0;
    }
        
    public void setTaxSystem(TaxSystem TaxSystem) {
        this.TaxSystem = TaxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        }
        else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }
    public void payTaxes() {
        int tax = TaxSystem.calcTaxFor(debit, credit);

        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");

        debit = 0;
        credit = 0;
    }
}
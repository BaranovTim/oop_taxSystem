package taxes;

public class SecondOption extends TaxSystem {
    @Override 
    public int calcTaxSystem(int debit, int credit) {
        int profit = debit - credit;
        if (profit <= 0) {
            return 0;
        }
        return (int) (profit * 0.15);
    }
}
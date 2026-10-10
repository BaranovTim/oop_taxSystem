package taxes;

public class FirstOption extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * 0.06);
    }
}

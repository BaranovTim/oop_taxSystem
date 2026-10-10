import taxes.FirstOption;
import taxes.SecondOption;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Ромашка", new FirstOption());

        company.shiftMoney(100000);
        company.shiftMoney(-30000);

        company.payTaxes();

        company.setTaxSystem(new SecondOption());

        company.shiftMoney(100000);
        company.shiftMoney(-30000);

        company.payTaxes();

        company.shiftMoney(10000);
        company.shiftMoney(-20000);

        company.payTaxes();
    }
}
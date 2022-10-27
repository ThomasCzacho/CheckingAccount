public class AccountTest {

    public static void main(String[] args) {

        CheckingAccount  sa0001 = new CheckingAccount();
        sa0001.balance = 1000;
        sa0001.name = "Damien";
        sa0001.interestTate = 0.02;
        sa0001.withdrawlAmmount = 1001;

        CheckingAccount sa0002 = new CheckingAccount();
        sa0002.balance = 2000;
        sa0002.name = "Bill";

        sa0001.displayCustomer();
        sa0001.withdrawl();
        sa0001.displayCustomer();
    }
}

public class CheckingAccount {
    public double balance;
    public double interestTate;
    public String name;
    public double withdrawlAmmount;

    public void displayCustomer(){
        System.out.println("Customer: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("Rate: "+interestTate);
    }
    public void withdrawl(){
        if (withdrawlAmmount<=balance){balance-=withdrawlAmmount;
            System.out.println("withdrawl successful");
        }else{
            System.out.println("Balance Too Low");
        }



    }
}

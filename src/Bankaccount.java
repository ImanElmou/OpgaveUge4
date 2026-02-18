import java.util.ArrayList;
public class Bankaccount {

    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    Bankaccount(String name, double startBalance){
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();

        transactions.add(new Transaction("deposit", startBalance));
    }

    void deposit (double amount) {
        if (amount > 0) {
            balance = balance + amount;
            transactions.add(new Transaction("deposit", amount));
            System.out.println("Indsatte " + amount + "kr.");
        }

    }

    void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            transactions.add(new Transaction("withdrawal", amount));
            System.out.println("Hævede " + amount + "kr.");
        }else if (amount > balance){
            System.out.println("Ikke nok penge på kontoen");
        }
    }

    void printTransactionHistory(){
        System.out.println("\n=== Transaktionshistorik for \"" + "Iman"+ "\" ===\"");
        for (Transaction t: transactions) {
            System.out.println(t);
        }
    }

    double getBalance(){
        return balance;
    }

}

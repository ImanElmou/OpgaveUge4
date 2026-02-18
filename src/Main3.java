

void main (){

Bankaccount account = new Bankaccount("Iman", 800);

account.deposit(500);
account.withdraw(300);
account.deposit(200);
account.withdraw(600);

account.printTransactionHistory();

    System.out.println("\n Nuværende saldo: " + account.getBalance() + " kr");
}

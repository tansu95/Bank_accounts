public class Test {
    public static void main(String[] args) {
        Account savingAcc = new SavingAccount("Сберегательный счет", 100_000);
        Account chekingAcc = new CheckingAccount("Расчетный счет", 100_000);
        Account creditAcc = new CreditAccount("Кредитка", -100_000);

        savingAcc.transfer(chekingAcc,5000);
        creditAcc.pay(11_000);
        chekingAcc.pay(70_000);
        creditAcc.add(200_000);
        savingAcc.pay(10_000);

        System.out.println("");
        System.out.println(savingAcc.accountName + " " + savingAcc.getAmount());
        System.out.println(chekingAcc.accountName + " " + chekingAcc.getAmount());
        System.out.println(creditAcc.accountName + " " + creditAcc.getAmount());
    }
}

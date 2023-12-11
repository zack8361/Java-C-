package b;

public class BackAccount {
    private int balance;
    public BackAccount(){
        this.balance = 0;
    }

//    PUBLIC METHOD : 입금
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
            return;
        }
        System.out.println("유효하지 않은 금액입니다.");
    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance >= amount){
            balance -= amount;
            return;
        }
        System.out.println("잔고가 부족합니다.");
    }

    public int getBalance(){
        return this.balance;
    }

    private boolean isAmountValid(int amount){
        return amount > 0;
    }
}

package oop1;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
        System.out.println(amount + "원 입금");
        System.out.println("현재잔고 : " + balance);
        
    }
    void withdraw(int amount){
        System.out.println(amount + "원 출금");
        if(balance >= amount) {
            balance -= amount;
            System.out.println("현재잔고 : " + balance);
        }
        else {
            System.out.println("잔고 부족합니다.");
            System.out.println("현재잔고 : " + balance);
        }
    }

}

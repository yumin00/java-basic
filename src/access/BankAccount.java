/*
캡슐화(Encapsulation)는 객체 지향 프로그래밍의 중요한 개념 중 하나다.
캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다.
캡슐화를 통해 데이터의 직접적인 변경을 방지하거나 제한할 수 있다.
캡슐화를 안전하게 완성할 수 있게 해주는 장치가 바로 접근 제어자다.

1. 데이터를 숨겨라
객체에는 속성(데이터)와 기능(메서드)가 있다. 캡슐화에서 필수로 숨겨하는 것은 데이터이다.
객체의 데이터는 기능을 통해 접근할 수 있도록 하는 것이다.

2. 기능을 숨겨라
객체의 기능 중에서 외부에서 사용하지 않고 내부에서만 사용하는 것이 있다. 이런 기능도 모두 감추는 것이 좋다.

즉 데이터는 모두 숨기고 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다.

 */


public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
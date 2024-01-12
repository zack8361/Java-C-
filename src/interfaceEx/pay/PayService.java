package interfaceEx.pay;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다" + option + " / " + amount);

        Pay pay = PayStore.findpay(option);

//      실제 결재를 수행하는 부분
        if(pay != null) {
            result = pay.pay(amount);
        }

        if(result){
            System.out.println("결제 성공");
        }
        else {
            System.out.println("결제 실패");
        }
    }
}

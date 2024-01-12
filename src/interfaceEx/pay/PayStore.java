package interfaceEx.pay;

public abstract class PayStore {
    public static Pay findpay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            System.out.println("결제 수단이 없습니다");
            return new DefaultPay();
        }
    }
}

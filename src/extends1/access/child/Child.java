package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectValue = 1; //상속관계 또는 같은 패키지
//        defaultValue = 1; //다른 패키지 안에있기 떄문에 접근 불가능
//        privateValue = 1; // 접근 불가 / 컴파일 오류
        publicMethod();
        protectedMethod();
        printParent();
    }
}

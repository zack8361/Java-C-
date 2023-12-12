package staticClass;

public class DecoUtil {

    
    
//   멤버 변수도 없고 그냥 밖에서 넘긴 기능가지고만 사용하는 메서드이기 때문에 Static 사용
    public String deco(String str){
        return "*" + str  + "*";
    }

    public static String decorate(String str){
        return "**" + str + "**";
    }
}

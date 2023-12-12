package final1;

public class User {
    String userEmail;

    String userPassword;
    String userName;
    int userType;

    String userRealType;

    public User(String userEmail, String userPassword,String userName,int userType){
        this.userEmail = userEmail;
        this.userEmail = userPassword;
        this.userName = userName;
        this.userRealType = (userType == 1) ? Constant.USER_MANAGER : Constant.USER_COMMON;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserRealType() {
        return userRealType;
    }
}

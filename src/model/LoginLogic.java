package model;

public class LoginLogic{

  public boolean execute(
    UserInfo user) {
    boolean ret = false;

    if (user.getPass().equals("1234")) {
      ret = true;
    }
    return ret;
  }
}

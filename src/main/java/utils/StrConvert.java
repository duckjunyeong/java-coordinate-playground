package utils;

public class StrConvert {

  public static String removeParen(String str){
    int strSize = str.length();
    if (str.charAt(0) != '(' || str.charAt(strSize - 1) != ')'){
      throw new IllegalArgumentException("좌표값은 괄호에 의해 묶여져야 합니다.");
    }
    return str.substring(1, strSize - 1);
  }
}

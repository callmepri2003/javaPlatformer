package javaplatformer.DataTransferObjects.DEBUG;

public class Debug {
  private static String flag;
  public static boolean debug = false;

  public static String getFlag() {
    return flag;
  }

  public static void setFlag(String string) {
    flag = string;
  }

  public static void updateFlag(String string) {
    flag += string;
  }
}

class AutoBoxTest {
  public static void main(String args[]) {
    System.out.println("".equals(new String("")));
    System.out.println("" == new String(""));
    System.out.println("".equals(""));
    System.out.println("" == "");
    System.out.println(1 == new Integer(1));
  }
}

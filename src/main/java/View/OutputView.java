package View;

public class OutputView {
  private static final int MAX_COORD = 24;
  private static final int MIN_COORD = 0;

  public void printGrid() {
    printCol();
    printSpace();
    printRow();
  }

  private void printCol(){
    for (int i = MAX_COORD; i >= MIN_COORD; i--){
      if (i % 2 == 0){
        System.out.printf("%2d  |\n", i);
        continue;
      }
      System.out.print("    |\n");
    }
  }

  private void printRow(){
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < MAX_COORD; i++){
      str.append("ㅡ ");
    }
    System.out.println(str);
    printSpace();

    for (int i = 0; i <= MAX_COORD; i++){
      if (i % 2 == 0) {
        System.out.printf("%2d", i);
        continue;
      }
      System.out.print("   ");
    }
    System.out.println();
  }

  private void printSpace(){
    System.out.print("     ");
  }
}

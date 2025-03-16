package View;

public class OutputView {
  private static final int MAX_COORD = 24;
  private static final int MIN_COORD = 0;

  public void printGrid() {
    for (int row = MAX_COORD; row >= 0; row--){
      printColStart(row);
      for (int col = 0; col < MAX_COORD; col++) {
        System.out.print(" # ");
      }
      System.out.println();
    }
    printRow();

  }

  private void printColStart(int row) {
    if (row % 2 == 0){
      System.out.printf("%2d  |", row);
      return;
    }
    System.out.print("    |");
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
      str.append("ㅁ ");
    }
    printSpace();
    System.out.println(str);
    printSpace();

    for (int i = 0; i <= MAX_COORD; i++){
      if (i % 2 == 0) {
        System.out.printf("%2d", i);
        continue;
      }
      System.out.print("  ");
      System.out.print(" ");

    }
    System.out.println();
  }

  private void printSpace(){
    System.out.print("     ");
  }

  public void printDistance(double distance) {
      System.out.println("Distance: " + distance);
  }

  public void writePoints() {
      System.out.println("Write Points");
  }
}

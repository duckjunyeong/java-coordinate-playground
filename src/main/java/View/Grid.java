package View;

import Model.Point;

import java.util.List;

public class Grid {

  private static final int MAX_COORD = 24;
  private static final int MIN_COORD = 0;

  public void printGrid(List<Point> points) {
    for (int row = MAX_COORD; row >= 0; row--){
      printColAxis(row);
      printPoints(row, points);
      printNewLine();
    }
    printRowAxis();
  }

  private void printRowAxis(){
    printRowAxisCharacter();
    printSpace();

    printRowAxisNumber();
    printNewLine();
  }

  private static void printRowAxisNumber() {
    for (int i = MIN_COORD; i <= MAX_COORD; i++){
      if (isEvenNum(i)) {
        printRowAxisEvenNum(i);
        continue;
      }
      printRowAxisOddNum();
    }
  }

  private void printRowAxisCharacter() {
    StringBuilder str = new StringBuilder();
    for (int i = MIN_COORD; i < MAX_COORD; i++){
      str.append("-- ");
    }
    printSpace();
    System.out.println(str);
  }

  private static void printRowAxisOddNum() {
    System.out.print("   ");
  }

  private void printColAxis(int row) {
    if (isEvenNum(row)){
      printColAxisEvenNum(row);
      return;
    }
    printColAxisOddNum();
  }

  private static void printColAxisOddNum() {
    System.out.print("    |");
  }

  private void printColAxisEvenNum(int row) {
    System.out.printf("%2d  |", row);
  }

  private void printPoints(int row, List<Point> points ){
    for (int col = 0; col < MAX_COORD; col++) {
      Point curPoint = new Point(row, col);
      if (points.contains(curPoint)){
        printPoint();
        continue;
      }
      printEmptyPoint();
    }
  }

  private void printNewLine(){
    System.out.println();
  }

  private void printEmptyPoint(){
    printRowAxisOddNum();
  }

  private void printPoint(){
    System.out.print(" # ");
  }

  private static boolean isEvenNum(int i) {
    return i % 2 == 0;
  }

  private static void printRowAxisEvenNum(int i) {
    System.out.printf("%2d ", i);
  }

  private void printSpace(){
    System.out.print("     ");
  }
}

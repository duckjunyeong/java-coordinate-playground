package View;

import Model.Point;

import java.util.List;

public class OutputView {

  public static void printGrid(List<Point> points) {
    for (int row = 24; row >= 0; row--) {
      printColAxis(row);
      printPoints(points, row);
      printNewLine();
    }
    printRowAxis();
  }

  private static void printRowAxis() {
    printFourEmptySpace();
    for (int i = 0; i <= 24; i++){
      System.out.print("--- ");
    }
    printNewLine();

    printRowAxisNumber();

  }

  private static void printRowAxisNumber() {
    printThreeEmptySpace();
    for (int i = 0; i <= 24; i++){
      if (i % 2 == 0){
        System.out.printf("%4d", i);
        continue;
      }
      printFourEmptySpace();
    }
  }

  private static void printThreeEmptySpace() {
    System.out.print("   ");
  }

  private static void printFourEmptySpace() {
    System.out.print("    ");
  }

  private static void printPoints(List<Point> points, int row) {
    for (int col = 0; col <= 24; col++){
      Point curPoint = new Point(col, row);
      isIncludeInPoints(curPoint, points);
    }
  }

  private static void isIncludeInPoints(Point curPoint, List<Point> points) {
    if (points.contains(curPoint)){
      System.out.printf("%3s", "#");
      return;
    }
    printFourEmptySpace();
  }


  private static void printColAxis(int row){
    if (row % 2 == 0) {
      System.out.printf("%2d|", row);
      return;
    }
    System.out.print("  |");
  }

  private static void printNewLine() {
    System.out.println();
  }

}

package Model;

import java.util.Objects;

public class Point implements Comparable<Point> {
  private int x;
  private int y;

  public Point(int x, int y) {
    isValidNumRange(x, y);
    this.x = x;
    this.y = y;
  }

  private void isValidNumRange(int x, int y) {
    if (x < 0 || x > 24 || y < 0 || y > 24){
      throw new IllegalArgumentException("0과 24이하의 숫자만 이용할 수 있습니다.");
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public int compareTo(Point point){
    return this.x - point.x;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Point point = (Point) o;
    return x == point.x && y == point.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}

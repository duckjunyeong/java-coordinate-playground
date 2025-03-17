package Model;

import Validator.CoordValidator;

import java.util.List;
import java.util.Objects;

public class Point implements Comparable<Point> {

  private int x;
  private int y;

  public Point(String coordStr){
    List<Integer> coordList = CoordValidator.isValidCoordStr(coordStr);
    x = coordList.get(0);
    y = coordList.get(1);
  }

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY(){
    return y;
  }

  @Override
  public int compareTo(Point other){
    return Integer.compare(this.x, other.x);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Point that = (Point) o;
    return x == that.x && y == that.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}

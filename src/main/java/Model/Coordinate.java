package Model;

import Validator.CoordValidator;

import java.util.List;
import java.util.Objects;

public class Coordinate {

  private int x;
  private int y;

  public Coordinate(String coordStr){
    List<Integer> coordList = CoordValidator.isValidCoordStr(coordStr);
    x = coordList.get(0);
    y = coordList.get(1);
  }

  public Coordinate(int x, int y){
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
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Coordinate that = (Coordinate) o;
    return x == that.x && y == that.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}

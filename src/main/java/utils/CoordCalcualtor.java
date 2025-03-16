package utils;

import Model.Coordinate;

public class CoordCalcualtor {

  public static double getDistance(Coordinate coord1, Coordinate coord2) {
    return Math.sqrt(Math.pow(coord1.getX() - coord2.getX(), 2) + Math.pow(coord1.getY() - coord2.getY(), 2));
  }
}

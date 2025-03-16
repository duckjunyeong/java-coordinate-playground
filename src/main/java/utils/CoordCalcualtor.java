package utils;

import Model.Point;

import java.util.List;

public class CoordCalcualtor {

  public static double getDistance(Point coord1, Point coord2) {
    return Math.sqrt(Math.pow(coord1.getX() - coord2.getX(), 2) + Math.pow(coord1.getY() - coord2.getY(), 2));
  }

  public static double getDistance(List<Point> points) {
    return Math.sqrt(Math.pow(points.get(0).getX() - points.get(1).getX(), 2) + Math.pow(points.get(0).getY() - points.get(1).getY(), 2));
  }

}

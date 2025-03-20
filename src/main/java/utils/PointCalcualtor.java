package utils;

import Model.Point;

public class PointCalcualtor {

  public static double getDistance(Point pos1, Point pos2){
    int pos1_x = pos1.getX();
    int pos1_y = pos1.getY();

    int pos2_x = pos2.getX();
    int pos2_y = pos2.getY();

    double result = Math.sqrt(Math.pow(pos1_x - pos2_x, 2) + Math.pow(pos1_y - pos2_y, 2));
    return Math.round(result * 100) / 100.0;
  }
}

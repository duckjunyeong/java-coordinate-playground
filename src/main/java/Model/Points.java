package Model;

import java.util.List;
import java.util.stream.Collectors;

public class Points {
  List<Point> pointList;

  public Points(List<String> pointList){
    this.pointList = pointList.stream()
        .map(Point::new)
        .collect(Collectors.toList());
  }

  public List<Point> getPointList(){
    return pointList;
  }

  public static double getDistance(Point coord1, Point coord2) {
    return Math.sqrt(Math.pow(coord1.getX() - coord2.getX(), 2) + Math.pow(coord1.getY() - coord2.getY(), 2));
  }
}

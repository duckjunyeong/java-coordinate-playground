package Model;

import utils.CoordCalcualtor;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Points {
  List<Point> pointList;

  public Points(List<String> pointList){
    this.pointList = pointList.stream()
        .map(Point::new)
        .collect(Collectors.toList());
  }

  public double getTwoPointDistance(){
    return CoordCalcualtor.getDistance(pointList);
  }

  public List<Point> getPointList(){
    return pointList;
  }

  public int getPointListSize(){
    return pointList.size();
  }

  public double calcuTriangleExtent() {
    if (pointList.size() != 3) throw new IllegalArgumentException("3개의 좌표가 없습니다.");
    Point pos1 = pointList.get(0);
    Point pos2 = pointList.get(1);
    Point pos3 = pointList.get(2);

    double a = CoordCalcualtor.getDistance(pos1, pos2);
    double b = CoordCalcualtor.getDistance(pos1, pos3);
    double c = CoordCalcualtor.getDistance(pos2, pos3);
    double s =  (a + b + c) / 2;

    double extent = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return Math.round(extent * 10) / 10.0;
  }

  public double getS(Point pos1, Point pos2, Point pos3){
    double sum = 0;
    sum += CoordCalcualtor.getDistance(pos1, pos2);
    sum += CoordCalcualtor.getDistance(pos1, pos3);
    sum += CoordCalcualtor.getDistance(pos2, pos3);

    return sum / 2;
  }

  public int calcuRectangleExtent() {
    Collections.sort(pointList);
    Point pos1 = pointList.get(0);
    Point pos2 = pointList.get(1);
    Point pos3 = pointList.get(2);
    Point pos4 = pointList.get(3);

    if (isSamePosOfX(pos1, pos2) && isSamePosOfX(pos3, pos4)) {
      if (getColSize(pos1, pos2) == getColSize(pos2, pos3)) {
        return getColSize(pos1, pos2) * getRowSize(pos1, pos3);
      }
    }
    throw new IllegalArgumentException("직사각형이 아닙니다.");
  }

  private int getRowSize(Point pos1, Point pos2){
    return Math.abs(pos1.getX() - pos2.getX());
  }

  private int getColSize(Point pos1, Point pos2){
    return Math.abs(pos1.getY() - pos2.getY());
  }

  private boolean isSamePosOfX(Point pos1, Point pos2){
    return pos1.getX() == pos2.getX();
  }

}

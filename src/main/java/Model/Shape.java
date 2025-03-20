package Model;

import java.util.List;

public abstract class Shape {
  private List<Point> points;

  public Shape(List<Point> points){
    this.points = points;
  }

  public List<Point> getPoints(){
    return points;
  }

  public abstract double getArea();
}

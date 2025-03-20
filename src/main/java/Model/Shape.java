package Model;

import java.util.List;

public abstract class Shape {
  private List<Point> points;
  private String name;

  public Shape(List<Point> points, String name){
    this.points = points;
    this.name = name;
  }

  public List<Point> getPoints(){
    return points;
  }

  public String getName(){
    return name;
  }

  public abstract double getArea();
}

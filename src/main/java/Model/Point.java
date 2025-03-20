package Model;

public class Point {
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
}

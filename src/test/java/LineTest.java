import Model.Line;
import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

public class LineTest {

  @Test
  @DisplayName("List<Point>의 사이즈가 2일 때 Line 객체가 생성되는가")
  void Line생성자_Test(){
    List<Point> pointList = Arrays.asList(new Point(10, 11), new Point(14, 19));
    Line line = new Line(pointList);
    assertThat(line.getPoints()).isEqualTo(Arrays.asList(new Point(10, 11), new Point(14, 19)));
  }

  @Test
  @DisplayName("두 좌표의 직선의 길이를 올바르게 구하는가")
  void Line_getArea_Test(){
    List<Point> pointList = Arrays.asList(new Point(10, 11), new Point(20, 21));
    Line line = new Line(pointList);
    assertThat(line.getArea()).isEqualTo(14.14, offset(0.01));
  }
}

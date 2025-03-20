import Model.Line;
import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LineTest {

  @Test
  @DisplayName("List<Point>의 사이즈가 2일 때 Line 객체가 생성되는가")
  void Line생성자_Test(){
    List<Point> pointList = Arrays.asList(new Point(10, 11), new Point(14, 19));
    Line line = new Line(pointList);
    assertThat(line.getPoints()).isEqualTo(Arrays.asList(new Point(10, 11), new Point(14, 19)));
  }
}

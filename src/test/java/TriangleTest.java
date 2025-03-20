import Model.Point;
import Model.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;


public class TriangleTest {

  @Test
  @DisplayName("Triangle 객체를 생성하고 삼각형의 넓이를 올바르게 구하는가")
  void Triangle_getArea_Test(){
    List<Point> pointList = Arrays.asList(new Point(10, 10), new Point(14, 15), new Point(20, 8));
    Triangle triangle = new Triangle(pointList);
    assertThat(triangle.getArea()).isEqualTo(29.0, offset(0.1));
  }
}

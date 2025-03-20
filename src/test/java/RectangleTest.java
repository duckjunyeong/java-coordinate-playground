import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import Model.Rectangle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RectangleTest {

  @Test
  @DisplayName("Rectangle객체를 생성하고 사각형의 넓이를 구하는가")
  void Rectangle_getArea_Test(){
    List<Point> pointList = Arrays.asList(new Point(10, 10), new Point(22, 10), new Point(22, 18), new Point(10, 18));
    Rectangle rectangle = new Rectangle(pointList);
    assertThat(rectangle.getArea()).isEqualTo(96);
  }
}

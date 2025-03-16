import Model.Point;
import View.OutputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class OutputViewTest {

  private static final OutputView outputView = new OutputView();

  @Test
  @DisplayName("좌표계가 올바르게 출력되는지 확인한다.")
  void printGrid_Test(){
    List<Point> points = Arrays.asList(new Point(3,3), new Point(10,10));
    outputView.printGrid(points);
  }

  @Test
  @DisplayName("두 직선의 거리를 올바르게 출력하는가.")
  void printDistance_Test(){
    double distance = 14.14;
    outputView.printDistance(distance);
  }
}

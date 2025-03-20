import Model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import View.OutputView;

public class OutputViewTest {

  @Test
  @DisplayName("특정 좌표의 값이 주어졌을 때 Grid를 올바르게 출력하는가")
  void outputView_printGrid_Test(){
    List<Point> points = Arrays.asList(new Point(14,12), new Point(5,1));
    OutputView.printGrid(points);
  }
}

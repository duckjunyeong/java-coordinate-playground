import Model.Point;
import View.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputViewTest {

  private final InputView inputView = new InputView();

  @Test
  @DisplayName("올바른 입력값이 주어지면 List<Point>타입으로 반환하는가")
  void 옳은입력값_readPoints_Method_Test(){
    String userInput = "(10,11)-(12,22)-(13,19)";
    List<Point> pointList = inputView.translateToPointList(userInput);
    Point point1 = new Point(10, 11);
    Point point2 = new Point(12, 22);
    Point point3 = new Point(13, 19);
    assertThat(pointList).isEqualTo(Arrays.asList(point1, point2, point3));
  }

  @Test
  @DisplayName("옳지 않는 입력값일 때 예외를 발생시키는가")
  void 옳지않은_입력값_readPoints_Method_Test(){
    String userInput1 = "(10,11)/(12,22)-(13,19)";
    assertThrows(IllegalArgumentException.class, () -> {
      inputView.translateToPointList(userInput1);
    });

    String userInput2 = "(10,11)- (12,22)-(13,19)";
    assertThrows(IllegalArgumentException.class, () -> {
      inputView.translateToPointList(userInput2);
    });
  }
}

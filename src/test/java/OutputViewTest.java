import View.OutputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OutputViewTest {

  private static final OutputView outputView = new OutputView();
  @Test
  @DisplayName("좌표계가 올바르게 출력되는지 확인한다.")
  void print_Grid(){
    outputView.printGrid();
  }
}

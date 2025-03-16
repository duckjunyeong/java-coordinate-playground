import Model.Coordinate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

import utils.CoordCalcualtor;

public class CoordCalcualtorTest {

  @Test
  @DisplayName("두 Coordinate값이 주어졌을 때 직선거리를 구하는지")
  void is_solve_distance(){
    Coordinate coord1 = new Coordinate(4, 9);
    Coordinate coord2 = new Coordinate(14, 19);

    assertThat(CoordCalcualtor.getDistance(coord1, coord2)).isEqualTo(14.14, offset(0.01));

  }

}

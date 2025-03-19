package coordinate;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Point> points);
}



// 이 create가 왜 있을 까 결국엔 points들의 size를 보고
// 어떤 도형을 만들지 판단하는 메서드거든
// points의 size값에 따라서 도형을 만들어 주는 추상화 메서드..

// 이 기능을 어디에 넣는게 좋겠어 도형을 만든다라고 했을 때
// 당연히 FigureFactory 클래스가 좋을 것 같애
//


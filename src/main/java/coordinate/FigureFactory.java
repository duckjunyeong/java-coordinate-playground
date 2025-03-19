package coordinate;

import java.util.List;

public class FigureFactory implements FigureCreator{
    static Figure getInstance(List<Point> points) {
        Figure figure = create
    }

    @Override
    public Figure create(List<Point> points){
        if (points.size() == Line.LINE_POINT_SIZE){
            return new Line(points);
        }

        if (points.size() == Triangle.TRIANGLE_POINT_SIZE) {
            return new Triangle(points);
        }

        if (points.size() == Rectangle.RECTANGLE_POINT_SIZE) {
            return new Rectangle(points);
        }
        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}


// Map 컬렉션은 뭘까 키와 값을 가지는 키-쌍구조 자료구조인데..
// 내가 키를 알고 있으면 값을 알게 되는, 내가 도형의 이름을 넣으면 해당 객체가 나오는거야?
// 아니지 이걸 반환해주면 Figure 클래스니깐 getName()으로 key에 접근해 g
// 인스턴스를 가져올 수 있는거 아니야?

< 구현 과정 >
0. 컨트롤러에서 좌표값을 입력받는다. 
    - inputView에서 값을 입력받고 검증한다. ex) "(10,2)-(11,22)"
        - 입력을 받고 List<Point>를 만들어서 반환한다.
            - 문자열을 검증과정
                  - "-"으로 쪼갠 후 해당 List를 Stream으로 만들어서 각각의 정규표현식을 이용하여 해당 문자열이 (으로 시작하고 ) 으로 끝나는지 그리고 확인 후
                     Point객체생성하여 반환해준다. --> List로 변환한 후 반환한다.  
   
    - List<Point> 를 이용해 좌표값을 찍어 출력한다.
    
    - List<Point> 를 이용해 해당 도형의 너비, 길이를 출력한다.
               - List<Point> 를 확인 후 사이즈가 2라면 직선 3라면 삼각형 4라면 직사각형의 생성자를 호출한다. 일단 생성한 후 interface나 클래스로 빼보기로 하자.
   

    

< TDD 과정 >

0. Point객체를 만든다. 객체를 생성하기 위해서는 0이상 24이하의 숫자만을 가져야한다.

1. StrConvert.toPointInstance 테스트, "(10,11)" 과같은 문자열이 주어졌을 때 올바른 format인지 확인하고, Point객체생성을 하는지 테스트한다.

2. InputView.readPoints 테스트, "(10,11)-(12,22)"와 같은 문자열이 주어졌을 때 "-"으로 쪼개고 StrConvert를 이용해 List<Point>를 반환하는지 테스트한다.

3. List<Point>가 2일 때 Line객체를 생성해본다.
      2-1. Line객체의 직선거리를 출력해본다. 

4. List<Point>가 3일 때 Trangle객체를 생성해본다.
      3-1. Trangle객체의 삼각형을 너비를 구한다.

5. List<Point>가 4일 때 Rectangle객체를 생성해본다. 4개의 좌표들의 x값들을 추출했을 때 중복을 제거한 후 
   사이즈가 2이어야하고 y값들도 추출한 후 중복을 제거하면 사이즈가 2이어야한다. 
      4-1. Rectangle객체의 사각형의 너비를 구한다.
   


< class 설계 >

### model
Class Point

- **멤버 변수:**
    - `private int x` 
    - `private int y` 
- **메서드:**
    - `public int getX()`
    - `public int getY()`
    - `public double distance(Point other)`

Class abstract Shpae
- **멤버 변수**
    - `private List<Point> points`

- **메서드:**
    - `public abstract double getArea()`
    - `public List<Point> getPoints()`

Class Line extends Shpae

- **멤버 변수:**
    - `private final String name = "Line"`
- **메서드:**
    - `public double getArea()`

Class Triangle extends Shpae

- **멤버 변수:**
    - `private final String name = "Triangle"`
- **메서드:**
    - `public double getArea()`

Class Rectangle extends Shape

- **멤버 변수:**
    - `private final String name = "Rectangle"`

- **메서드:**
    - `public double getArea()`
    


### view
Class OutputView

- **메서드**
    - `public void announceWritePoints`
    - `public void printGrid()`
    - `public void printArea()`

Class InputView

- **메서드**
    - `public List<Point> readPoints`
    - `public List<Point> translateToPointList`



### utils

Class StrConvertUtils

- **메서드**
    - `public Point toPointInstance(String point)` 


Class MathUtils

- **메서드**
    - `public doube roundToPlaces(double curNum, int place)`
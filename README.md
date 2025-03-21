
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

5. MathUtils 클래스 roundToPlaces 메서드 테스트 및 리팩토링 진행

6. List<Point>가 4일 때 Rectangle객체를 생성해본다. 4개의 좌표들의 x값들을 추출했을 때 중복을 제거한 후 
   사이즈가 2이어야하고 y값들도 추출한 후 중복을 제거하면 사이즈가 2이어야한다. 
      4-1. Rectangle객체의 사각형의 너비를 구한다.
7. 특정 좌표값이 주어졌을 때 해당 좌표에 .을 찍고 grid를 그리는지 테스트

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


2차구현을 하며..
- interface와 추상클래스의 차이를 코드를 통해 조금 이해할 수 있게 되었다. 하늘 위를 나는 것들은 나의 고도가 얼마인지, 속도가 얼마인지에 관한 정보를
가지고 있다. 이런 것을 interface로 묶는 것이다. 추상클래스는 여러 비행기의 종류들을 공통된 특징들을 가지고 있는 부모 클래스를 말할 수 있다. 조금 더 
좁은 범위로 들어온 느낌이다. 현재로써는 이렇게 이해하였고 앞으로는 추상클래스를 만들고 그 안에서 여러 클래스에서 공통된 메서드를 사용한다면 그것들을 
모아 하나의 interface로 만들면 관리와 가독성이 더 높아질 것 같다. 더 중요한 것은 interface를 사용하면 변경가능성이 높은 기능들에 대해서 대처하기가
쉽다는 것이다. 예를 들어

다음과 같은 4종류의 비행기가 존재한다고 가정해보자. 

class A81 


class B92


class C99


class P12


나는 이 중 하나의 비행기를 탈 수 있다. 오늘은 A81비행기를 탄다고 하면

A81 plane = new A81(); 
plane.go() 


다음날은 P12를 탄다고 해보자

P12 plane = new P12();
plane.go()


근데 이게 맨날 바뀌면 코드를 어떻게 매번 수정할 수 있겠는가.. interface로 묶으면 좋다.

interface Plane 
    void go();

class A81 implements Plane


class B92 implements Plane


class C99 implements Plane


class P12 implements Plane

그럼 내가 뭘 타던간에 생성자함수나 매개변수를 통해 의존성을 주입받을 수 있다. 

private Plane plane;

Main(Plane plane){
    this.plane = plane;
}
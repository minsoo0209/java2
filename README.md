# 202330226 전민수
## 04.29 9주차

## 주제: 상속 (Inheritance)

### 1. 상속의 기초 (Inheritance Basics)
상속은 기존 클래스를 재사용하여 새로운 클래스를 작성하는 자바의 핵심 기술입니다.

- 키워드: extends를 사용하여 부모 클래스를 지정합니다.
- 특징:
    - 자바는 단일 상속만 지원합니다.
    - 상속을 받으면 부모의 필드와 메소드를 물려받아 사용할 수 있습니다.
    - super()를 통해 부모 클래스의 생성자를 호출합니다.

### 2. 메소드 오버라이딩 (Method Overriding)
부모 클래스로부터 물려받은 메소드를 자식 클래스에서 새롭게 재정의하는 기능입니다.

- 동적 바인딩: 부모 타입으로 선언된 레퍼런스라도 실제 객체가 자식 객체라면, 자식의 오버라이딩된 메소드가 실행됩니다.

### 3. 추상 클래스 vs 인터페이스
구분 | 추상 클래스 (Abstract Class) | 인터페이스 (Interface)
:--- | :--- | :---
키워드 | abstract class | interface
구성 | 추상 메소드 + 일반 메소드 | 주로 추상 메소드 + 상수
목적 | 기능 확장 및 상속 계층 형성 | 클래스 간의 동일한 규격 정의
구현 | extends (단일 상속) | implements (다중 구현 가능)

### 4. 핵심 코드 예제 (Point & ColorPoint)
```java
class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public void show() { System.out.println("(" + x + "," + y + ")"); }
}

class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x, int y, String color) {
        super(x, y); // 부모 생성자 호출
        this.color = color;
    }
    @Override
    public void show() { // 오버라이딩
        System.out.println(color + "색 점 (" + x + "," + y + ")");
    }
}
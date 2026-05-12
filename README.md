# 202330226 전민수
## 05.06 10주차
## 6장. 모듈, 패키지 및 기본 클래스 활용

### 1. 패키지(Package)와 import
- 클래스를 기능별로 묶어 관리하는 디렉터리 구조로, 클래스 이름 충돌을 방지합니다.
- 외부 패키지의 클래스를 가져올 때는 `import` 문을 사용하여 경로를 명시합니다.

### 2. Wrapper 클래스와 박싱/언박싱
- **Wrapper 클래스**: int, char 등 기본 타입을 객체로 다루기 위해 제공되는 클래스입니다.
- **박싱(Boxing)**: 기본 타입의 값을 대응하는 Wrapper 객체로 변환하는 과정입니다.
- **언박싱(Unboxing)**: Wrapper 객체에서 값을 꺼내 기본 타입으로 변환하는 과정입니다.
- **자동 변환**: 컴파일러가 상황에 맞춰 자동으로 박싱과 언박싱을 처리해 줍니다.

### 3. Math 클래스
- 모든 메소드가 정적(static)으로 선언되어 객체 생성 없이 클래스명으로 호출합니다.
- `Math.random()`: 0.0 이상 1.0 미만의 무작위 난수를 생성합니다.
- `Math.abs()`: 수치의 절대값을 계산합니다.
- `Math.sqrt()`: 수치의 제곱근을 계산합니다.

### 4. Object 클래스
- 모든 자바 클래스의 최상위 조상 클래스입니다.
- `equals()`: 객체의 내용이 같은지 비교하기 위해 자주 재정의하여 사용합니다.
- `toString()`: 객체를 문자열로 표현할 때 사용하며, 보통 클래스 정보를 출력하도록 오버라이딩합니다.

## 7장. 제네릭과 컬렉션

### 1. 컬렉션 프레임워크(Collection Framework)
- 가변 크기의 컨테이너로, 배열의 크기 고정 문제를 해결한 구조입니다.
- **ArrayList<E>**: 인덱스를 사용해 객체를 순차적으로 관리하는 동적 배열입니다.
- **HashMap<K, V>**: 키(Key)와 값(Value)을 쌍으로 묶어 관리하며, 키를 이용한 검색 성능이 뛰어납니다.

### 2. 제네릭(Generic)
- 클래스나 메소드에서 사용할 데이터 타입을 파라미터화하여 결정하는 기법입니다.
- 컴파일 시점에 엄격하게 타입을 체크하여 타입 안정성을 보장하고 불필요한 형 변환을 줄여줍니다.



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
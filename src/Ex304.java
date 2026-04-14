public class Ex304{
    public static void main(String[] args) {
        for(int i=2; i<10; i++) {
            System.out.print("[" + i + "단]\t"); //제목 단끼리 곱하기 {}주의하기
        }
        System.out.println();
            for (int i = 1 ; i < 10; i++) { // 위에 {}으로 묶어서 i를 인식하려면 변수선언 다시
            for(int j=2; j<10; j++) {
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }
}




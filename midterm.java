import java.io.*;

public class midterm {

public static void main(String[] args)throws IOException{

BufferedReader in=new BufferedReader(new InputStreamReader(System.in));



int imsi=0;


System.out.print("시작 수를 입력하세요:");

int num1=Integer.parseInt(in.readLine()); //시작 수 받기

System.out.print("끝 수를 입력하세요:");

int num2=Integer.parseInt(in.readLine()); //끝 수 받기


System.out.print("찾고자 하는 배수를 입력하세요: : ");

int n=Integer.parseInt(in.readLine()); // 배수 입력하기


if(num1>num2){

imsi=num1;

num1=num2;

num2=imsi;

} // 처음 수 보다 끝 수가 작다면 두 수를 바꿔서 저장
System.out.println("num1에서 num2까지 사이의 n의 배수는 0개입니다.");
System.out.println("그 수는 다음과 같습니다.");
for(int i=num1;i<=num2;i++){

if(i%n==0){
System.out.print(i+",");


}
}
}
}
package basic;

import java.util.Scanner;

public class SpinTheString {

//      문제 설명
//    문자열 str이 주어집니다.
//    문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
//            substring( beginIndex, endIndex ) 메서드 / beginIndex 시작지점, endIndex 추출할 열이다.
//            System.out.println(str.substring(i, i + 1));

//            charAt(int index) 문자열에서 특정 인덱스에 위치한 문자를 반환
//            예외 발생 사항 StringIndexOutOfBoundsException: 인덱스가 유효하지 않은 경우, 즉, 0보다 작거나 문자열의 길이보다 큰 경우 이 예외가 발생한다.
            System.out.println(str.charAt(i));
        }
    }
}

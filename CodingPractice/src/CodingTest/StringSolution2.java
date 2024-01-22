package CodingTest;

import java.util.Scanner;

public class StringSolution2 {
    public static void main(String[] args) {

//        문제 설명
//        문자열 str과 정수 n이 주어집니다.
//        str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
//
//        제한사항
//        1 ≤ str의 길이 ≤ 10
//        1 ≤ n ≤ 5


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

//        if(str.length() >=1 && str.length() <= 10){
        // repeat 함수 : str을 반복한다 => n번 만큼
//        System.out.println(str.repeat(n));

//        if(str.length() >= 1 && str.length() <= 10 && n >= 1 && n <= 5) {
            for (int i = 0; i < n; i++){
                System.out.print(str);
            }
    }
}

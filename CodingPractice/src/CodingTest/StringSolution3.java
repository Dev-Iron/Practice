package CodingTest;

import java.util.Scanner;

public class StringSolution3 {
    public static void main(String[] args) {

//        문제 설명
//        영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
//
//                제한사항
//        1 ≤ str의 길이 ≤ 20
//        str은 알파벳으로 이루어진 문자열입니다.

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        // 문자열을 문자 배열로 변환
        char[] chars = a.toCharArray();

        // 각 알파벳에 대해 대문자와 소문자를 변환
        for (int i = 0; i < chars.length; i++){
            if (Character.isUpperCase(chars[i])){
                // 대문자인 경우, 소문자로 변환
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                // 소문자인 경우, 대문자로 변환
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        // 변환된 문자 배열을 문자열로 변환하여 출력
        String result = new String(chars);
        System.out.println(result);


//        ============ 배열을 사용하지 않은 상태 ==================

//        StringBuilder result = new StringBuilder();

        // 각 알파벳에 대해 대문자와 소문자를 변환하여 결과에 추가
//        for (int i = 0; i < a.length(); i++) {
//            char c = a.charAt(i);
//            if (Character.isUpperCase(c)) {
                // 대문자인 경우, 소문자로 변환하여 추가
//                result.append(Character.toLowerCase(c));
//            } else {
                // 소문자인 경우, 대문자로 변환하여 추가
//                result.append(Character.toUpperCase(c));
//            }
//        }

        // 최종 결과를 출력
//        System.out.println(result.toString());
//    }



}
}

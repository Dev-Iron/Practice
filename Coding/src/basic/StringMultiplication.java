package basic;

public class StringMultiplication {
//    문제 설명
//   문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

//    입력받은 문자열을 받은 인수만큼 출력하면된다.
//    1. 문자열을 입력받은 인수만큼 for문을 돌리면된다.
    public static String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("string",3));
    }

}

package novice;

public class SumOfTwoNumbers {
//    문제 설명
//    정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.

    public static int solution(int num1, int num2) {
        int answer = -1;
        if ( -50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000) {
            answer = num1 + num2;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,4));
    }

}

package basic;

public class Drainage {
//    문제 설명
//    정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

//    1. 정수 num과 n을 소인수 분해 한다.
//    2. 소인수 분해하여 num이 n의 배수이면 1을 아니면 0을 return 한다.
        public static int solution(int num, int n) {
            int answer = 0;

            answer = num%n;
            return answer > 0 ? 0 : 1;
        }

    public static void main(String[] args) {
        System.out.println(solution(40,7));
    }
}

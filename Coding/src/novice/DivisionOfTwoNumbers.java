package novice;

public class DivisionOfTwoNumbers {

//    문제 설명
//    정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
        public static int solution(int num1, int num2) {
            int answer = 0;
            boolean val = 0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100;
            if (val) {
                double result = (num1 / (double)num2) * 1000;
                answer = (int)result;
            } else {
                answer = -1;
            }
            return answer;
        }

    public static void main(String[] args) {
        System.out.println(solution(3,2));
    }
}

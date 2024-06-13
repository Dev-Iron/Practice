package novice;

public class CompareNumbers {

//    문제 설명
//    정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

        public static int solution(int num1, int num2) {
            int answer = 0;
            if ( 0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000) {
                answer = num1 == num2 ? 1 : -1;
            }
            return answer;
        }

    public static void main(String[] args) {
        System.out.println(solution(2,3));
    }
}

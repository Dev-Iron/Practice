package basic;

public class ReturnValue {

//    문제 설명
//    양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
//    n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.


//    1. 정수 n이 홀수인지 짝수인지 구분 한다.
//    2. n이 홀수이면 n 이하의 홀수인 모든 양의 정수 합을 return 한다.
//    3. n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 한다.
        public static int solution(int n) {

            // 홀수의 합
            // n까지의 제한. n %2 == 1 +
            int oddNumber = 0;
            for (int i = 0; i <= n; i++) {
                if ( i % 2 == 1){
                    oddNumber += i;
                }
            }
            System.out.println("oddNumber " + oddNumber);

            // 짝수의 제곱 합
            int evenNumber = 0;
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    evenNumber += Math.pow(i, 2);
                }
            }
            System.out.println("evenNumber " + evenNumber);
            return n % 2 == 0 ? evenNumber : oddNumber;
        }

    public static void main(String[] args) {
        System.out.println(solution(9));
    }

}

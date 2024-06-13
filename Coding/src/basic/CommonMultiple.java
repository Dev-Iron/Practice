package basic;

public class CommonMultiple {
//    문제 설명
//    정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

//      1. number와 n의 배수를 확인한다.
//      2. n의 배수와 m의 배수를 확인한 후 n의 배수이면서 m의 배수이면 1을 아니면 0을 return

        public static int solution(int number, int n, int m) {
//            int nn = number % n == 0 ? 1 : 0;
//            int mn = number % m == 0 ? 1 : 0;
//            return nn == 1 && mn == 1 ? 1 : 0;

            return number % n == 0 && number % m == 0 ? 1 : 0;
        }

    public static void main(String[] args) {
        System.out.println(solution(30,2,3));
    }

}

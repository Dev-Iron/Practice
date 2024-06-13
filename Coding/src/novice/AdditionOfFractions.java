package novice;

import java.util.Arrays;

public class AdditionOfFractions {

//    문제 설명
//    첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
//    두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

//    1. 분수를 구한다.
//    2. 분수를 더한 후 배열에 넣어준다.


        public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int[] answer = new int[2];

//            분자를 구함
            int numer = numer1 * denom2 + numer2 * denom1;

//            분모를 구함
            int denom = denom1 * denom2;


//            두 분수를 더한 결과를 기약 분수로 변환
            int gcd = gcd(numer, denom);
            // 최대공약수를 구함
            numer /= gcd; // 분자를 최대공약수로 나눔
            denom /= gcd; // 분모를 최대공약수로 나눔

            answer[0] = numer; // 배열의 첫 번째 원소에 분자를 저장
            answer[1] = denom; // 배열의 두 번째 원소에 분모를 저


            return answer;

        }

        // 최대 공약수를 구하는 함수
        private static int gcd (int a, int b) {
            while ( b != 0){
                int temp = a % b;
                a= b;
                b = temp;
            }
            return a;
        }

    public static void main(String[] args) {
        int [] result = solution(1,2,3,4);
        System.out.println(Arrays.toString(result));

    }
}

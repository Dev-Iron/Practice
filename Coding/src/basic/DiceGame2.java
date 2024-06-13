package basic;

public class DiceGame2 {

//    문제 설명
//    1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
//
//    세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
//    세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
//    세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
//    세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

//    1. 주사위의 동일한 값이 나온지 확인한다,
//    2. 동일한 값에 따라 값을 구분하여 구한다.
    public int solution(int a, int b, int c) {
        if (a < 1 || a > 6 || b < 1 || b > 6 || c < 1 || c > 6) {
            throw new IllegalArgumentException("주사위 눈의 값은 1 이상 6 이하의 정수여야 합니다.");
            //        숫자가 동일한지 조건문을 걸고 싶다.
        }
        int sum = a + b + c;
        int squareSum = a * a + b * b + c * c;
        int cubeSum = a * a * a + b * b * b + c * c * c;


            if (a == b && b == c ) {  //  세 숫자가 모두 같을 때
                return sum * squareSum * cubeSum;

            } else if ( a == b || a == c || b == c ) {  // 숫자 두개가 같을 때
                return  sum * squareSum;

            } else {    // 세 숫자가 모두 다를 때
                return  sum;
            }
    }

    public static void main(String[] args) {
        System.out.println(new DiceGame2().solution(5r,3,3));
    }
}

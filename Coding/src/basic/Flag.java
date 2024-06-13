package basic;

public class Flag {
//    문제 설명
//    두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
//    flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.


//    1. if 문을 통해 flag의 ture & false를 구분한다.
//    2. ture 이면 a + b를 false 이면 a- b를 return 한다.
        public static int solution(int a, int b, boolean flag) {
//            if( flag == true) {
//                return a + b;
//            } else {
//                return a - b;
//            }

//            int ab = a + b;
//            int ba = a - b;
//
//            return flag ? ab : ba;

            return flag ? a + b : a - b;
        }

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, false));
    }
}

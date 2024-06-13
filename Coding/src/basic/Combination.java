package basic;

public class Combination {

//    문제 설명
//    연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//            12 ⊕ 3 = 123
//            3 ⊕ 12 = 312
//    양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//    단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

//    1. 두 개의 정수에 대해 붙여 쓰는 메소드를 작성.
//    2. ab 와 ba에 대한 값을 비교 if문을 통해 더 큰 값을 출력 만약 동일하다면 ab를 출력

    public static int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));

//        조건을 삼항식으로
        return ab >= ba ? ab : ba;

//        조건을 if문으로
//        if (ab >= ba) {
//            return ab;
//        } else {
//            return ba;
//        }
    }

    public static void main(String[] args) {
        System.out.println(solution(4,12));
        System.out.println(solution(3,9));
    }
}

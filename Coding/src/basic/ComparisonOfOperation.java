package basic;

public class ComparisonOfOperation {

//    문제 설명
//    연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//            12 ⊕ 3 = 123
//            3 ⊕ 12 = 312
//    양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//    단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.


//    1. 두 정수의 대한 붙여서 쓴 값과 2 * a * b 값을 도출해낸다.
//    2. 삼항식과 if문을 통해 두 값을 비교하여 더 큰 값을 return한다.
        public static int solution(int a, int b) {
            int ab =Integer.parseInt("" + a + b);
            int ab2 = 2 * a * b;
            return ab >= ab2 ? ab : ab2;
        }

    public static void main(String[] args) {
        System.out.println(solution(3, 4));
    }

}

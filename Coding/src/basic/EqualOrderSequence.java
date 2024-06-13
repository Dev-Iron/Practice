package basic;

public class EqualOrderSequence {

//    문제 설명
//    두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가
//    i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

//    1. 반복문을 통해 각 항 계산: for 루프를 사용하여 included 배열을 순회합니다.
//    2. 포함된 항 더하기: included[i]가 true인 경우 해당 항 a + i * d를 sum에 더합니다.
//    3. 결과 반환: sum을 반환하여 포함된 항들의 합을 구합니다.
    public int solution(int a, int d, boolean[] included) {

        int sum = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
            sum += a + i * d;
                System.out.println("included[" + i + "] = " + included[i] + ", sum = " + sum);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 5;
        int d = 3;
        boolean[] included = {true, false, false, false, true};
        System.out.println(new EqualOrderSequence().solution(a, d, included));
    }
}

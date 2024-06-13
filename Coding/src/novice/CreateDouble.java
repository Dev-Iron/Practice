package novice;

import java.util.Arrays;

public class CreateDouble {

//    문제 설명
//    정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

    // 1. 입력 받은 배열을 for 문을 통해 주소값으로 접근해 두배씩 구한다.
        public static int[] solution(int[] numbers) {
//            int[] answer = {};
//            for (int i = 0; i < numbers.length; i++) {
//                numbers[i] = numbers[i] * 2;
//            }
//            return numbers;

            return Arrays.stream(numbers).map( i -> i * 2).toArray();
        }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5};
        int[] result = solution(numbers);
        System.out.println(Arrays.toString(result));

    }

}

package basic;

public class LastTwoElements {

//    문제 설명
//    정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서
//    그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

//    1. 마지막 원소가 그 전 원소보다 크면 [last] - [last -1]
//    2. 마지막 원소가 그 전 원소보다 작다면 [last] * 2

    public static int[] solution(int[] num_list) {

        // 마지막 배열의 값과 마지막 이전의 배열 값을 추출.
        int last = num_list[num_list.length -1];
        int secondLast = num_list[num_list.length -2];

        // 조건문
        int value = 0;
        if (last > secondLast) {
            value = last - secondLast;
        } else {
            value = last * 2;
        }

        // num_list에 새로운 값을 추가하기 위해 기존 배열에 +1을 해준다.
        int[] answer = new int[num_list.length +1];
        // 반복문을 통해 answer 배열에 num_list 값을 넣어준다.
        for (int i = 0; i < num_list.length; i++) {
             answer[i] = num_list[i];
        }
        // 새로운 배열 answer의 마지막 요소에 value 값을 할당. value는 조건문을 통과한 후 그에 맞는 값을 가지게 됨.
        answer[num_list.length] = value;
        return answer;
    }


    public static void main(String[] args) {
        int[] num_list = {2, 1, 5};
        int[] num_list1 = {5, 2, 1, 7, 5};
        int[] result = solution(num_list);
        int[] result1 = solution(num_list1);

        System.out.println("RESULT 1 : ");
        for (int value : result) {
            System.out.println(value + " ");
        }

        System.out.println("RESULT 2 : ");
        for (int value : result1) {
            System.out.println(value + " ");
        }
    }

}

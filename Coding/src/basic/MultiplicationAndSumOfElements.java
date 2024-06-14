package basic;

public class MultiplicationAndSumOfElements {
//    문제 설명
//    정수가 담긴 리스트 num_list가 주어질 때,
//    모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.


//    1. 반복문을 통해 배열에 담긴 값을 꺼낸다.
//    2. 배열에 담긴 값을 더한 후 제곱 / 배열에 담긴 값을 하나씩 곱해준다.
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;

        // 배열에 담긴 값을 하나씩 꺼내준다.
        for (int i = 0; i < num_list.length; i++ ) {
            sum += num_list[i];
            product *= num_list[i];
        }

        return (sum * sum) > product ? 1 : 0;

        // 문제 풀이 중 가장 내 이상향에 원하는 코드
//        int sum = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
//        int product = Arrays.stream(num_list).reduce((i,j)->i*j).getAsInt();
//        return sum*sum >product ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] num_list = {5, 7, 8, 3};
        int[] num_list2 = {3, 4, 5, 2, 1};
        System.out.println(new MultiplicationAndSumOfElements().solution(num_list));
        System.out.println(new MultiplicationAndSumOfElements().solution(num_list2));
    }
}

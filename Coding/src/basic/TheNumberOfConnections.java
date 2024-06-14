package basic;

public class TheNumberOfConnections {

//    문제 설명
//    정수가 담긴 리스트 num_list가 주어집니다.
//    num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

//    1. num_list 리스트의 값을 꺼낸다.
//    2. 꺼낸 값을 홀수와 짝수로 나눈다.
//    3. 나눈 값을 각각 이어 붙인 후 더한다.
    public int solution(int[] num_list) {
        String even ="", odd = "";
        for (int i = 0; i < num_list.length; i++ ) {

            if (num_list[i] % 2 == 0) {
                even += String.valueOf(num_list[i]);
            } else  {
                odd += String.valueOf(num_list[i]);
            }
        }
        int answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(new TheNumberOfConnections().solution(num_list));
    }
}

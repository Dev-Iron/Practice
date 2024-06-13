package basic;

public class StringConversion {

//    문제 설명
//    문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

        public static String solution(String[] arr) {
            String answer = "";
            for (int i = 0; i < arr.length; i++) {
                char[] chars = arr[i].toCharArray();
                answer = answer + String.valueOf(chars);
            }
            return answer;
        }

    public static String solution1(String[] arr) {
        String answer = "";

//        이중 for 문
        for (String s : arr) {
            answer += s;
        }

//        기본 for 문
//        for (int i = 0; i< arr.length; i++){
//            answer += arr[i];
//        }


        return answer;
    }


    public static void main(String[] args) {
        System.out.println("@@@@@@@@@@@@@@@");
        System.out.println(solution1(new String[]{"a", "b", "c"}));
        System.out.println("@@@@@@@@@@@@@@@");
    }

}

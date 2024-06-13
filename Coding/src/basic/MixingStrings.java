package basic;

public class MixingStrings {

//    문제 설명
//    길이가 같은 두 문자열 str1과 str2가 주어집니다.
//    두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

    public static String solution(String str1, String str2) {
            String answer = "";

            for (int i = 0; i < str1.length(); i++) {
                answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i)); // 문자열 결합을 해주어야 합니다.
            }
            return answer;
        }

    public static String solutionArray(String str1, String str2) {
        String answer = "";
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars1.length; i++) {
            sb.append(chars1[i]).append(chars2[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("aaaaa" , "bbbbb"));
        System.out.println("@@@@@@@@@@");
        System.out.println(solutionArray("aaaaa" , "bbbbb"));
    }

}

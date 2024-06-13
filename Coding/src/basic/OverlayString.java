package basic;

public class OverlayString {

//          문제 설명
//      문자열 my_string, overwrite_string과 정수 s가 주어집니다.
//      문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로
//      바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

    public static String solution ( String my_string, String overwrite_string, int s){
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        return answer;
    }

    public static String solutionArray ( String my_string, String overwrite_string, int s){
        char[] my_chars = my_string.toCharArray();
        char[] overwrite_chars = overwrite_string.toCharArray();

        for (int i = 0; i< overwrite_string.length(); i++){
            my_chars[s + i] = overwrite_chars[i];
        }
        return String.valueOf(my_chars);
    }


    public static void main(String[] args) {
//        String str = "He11oWor1d";
//        String str1 = "lloWorl";
//        System.out.println(str.substring(0,2));
//        System.out.println(str1.length());
//        System.out.println(str.substring(2 + str1.length()));
//        System.out.println("@@@@@@@@@");
//        System.out.println(solution("He11oWor1d", "lloWorl", 2));

        System.out.println(solutionArray("He11oWor1d", "lloWorl", 2));
    }

}

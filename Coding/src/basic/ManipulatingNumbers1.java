package basic;

public class ManipulatingNumbers1 {

//    문제 설명
//    정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며,
//    control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
//
//        "w" : n이 1 커집니다.
//        "s" : n이 1 작아집니다.
//        "d" : n이 10 커집니다.
//        "a" : n이 10 작아집니다.
//    위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.

    public static int solution(int n, String control) {

        // 문자열을 문자로 변환 후 문자 배열로 넣는다.
        char[] chars = control.toCharArray();

        // control의 길이만큼 반복문을 통해 조건을 실시.
        for (int i = 0; i < control.length(); i++) {
            switch (chars[i]) {
                case 'w' :
                    n += 1;
                    break;
                case 's' :
                    n -= 1;
                    break;
                case 'd' :
                    n += 10;
                    break;
                case 'a' :
                    n -= 10;
                    break;
                default:
                    System.out.println(chars[i]);
                    break;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        System.out.println(solution(n, control));
    }
}

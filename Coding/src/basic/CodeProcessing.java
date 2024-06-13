package basic;

public class CodeProcessing {

//    문제 설명
//    문자열 code가 주어집니다.
//    code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
//    mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.

//    mode가 0일 때
//    code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
//    code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.

//    mode가 1일 때
//    code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
//    code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
//    문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
//    단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.

//    1. 코드의 index를 하나씩 천천히 뜯어보며 확인한다.
//    2. mode가 0일 때 code[idx]가 짝수일 때 ret의 맨 뒤에 code[idx]를 추가한다.
//    3. code[idx]가 "1"이면 mode를 0에서 1로 변경
//    4. mode가 1일 때 code[idx]가 홀수일 때 ret의 맨 뒤에 code[idx]를 추가한다.
//    5. code[idx]가 "1"이면 mode를 1에서 0으로 변경

    public static String solution(String code) {

        StringBuilder ret = new StringBuilder();
        int mode = 0;

        // 코드의 문자열을 인덱스 값으로 추출한다.
        for (int idx = 0; idx < code.length(); idx++) {
            char c = code.charAt(idx);

            if (c == '1') {
                mode = 1 - mode; // mode를 0에서 1로, 1에서 0으로
            } else {
                if (mode == 0 && idx % 2 == 0) {
                    ret.append(c);
                } else if (mode == 1 && idx % 2 == 1) {
                    ret.append(c);
                }
            }
        }
            return ret.length() > 0 ? ret.toString() : "EMPTY";
    }

    public static void main(String[] args) {
        String code = "abc1abc1abc";
        System.out.println(solution(code));
    }
}

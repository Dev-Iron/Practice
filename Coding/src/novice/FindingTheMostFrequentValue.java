package novice;

import java.util.*;
public class FindingTheMostFrequentValue {



//    문제 설명
//    최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
//    정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
//    최빈값이 여러 개면 -1을 return 합니다.



        public int solution(int[] array) {
            // 빈도수를 저장할 HashMap 생성
            Map<Integer, Integer> countMap = new HashMap<>();

            // 배열의 각 값의 등장 횟수 카운트
            for (int i = 0; i < array.length; i++) {
                int num = array[i];
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            // 최빈값 찾기
            int mode = -1;
            int maxCount = 0;
            int modeCount = 0;

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int num = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount) {
                    maxCount = count;
                    mode = num;
                    modeCount = 1;
                } else if (count == maxCount) {
                    modeCount++;
                }
            }

            // 최빈값이 여러 개인 경우 -1 반환
            if (modeCount > 1) {
                return -1;
            }

            return mode;
        }

        public static void main(String[] args) {
            int[] array = {1,2,3,3,3,4,};
            System.out.println(new novice.FindingTheMostFrequentValue().solution(array));
        }
    }

